package org.claytantor.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.claytantor.IntpickApp;
import org.claytantor.model.IntpickerRequest;
import org.claytantor.service.HashMakerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by claytongraham on 5/25/18.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(value = IntpickerController.class, secure = false)
public class IntpickerControllerTest {

    private Gson objGson = new GsonBuilder().setPrettyPrinting().create();

    @MockBean
    private HashMakerService hashMakerService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void evaluatesExpression() {
        Integer sum = 6;
        assertEquals(6, sum.intValue());
    }

    @Test
    public void evaluatesPostActionHappyPath() throws Exception {

        //mock results from service
        //should return 2 and 4
        Integer[] intArray = { -5, 1, 5, 6, 10, 21 };


        Mockito.when(
                hashMakerService.makeIntegerHash(Mockito.anyList())).thenReturn(null);


        List<Integer> items = Arrays.asList(intArray);
        IntpickerRequest request = new IntpickerRequest(items, 15);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post(
                "/intpicker").accept(
                MediaType.APPLICATION_JSON)
                .content(objGson.toJson(request))
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        Type listType = new TypeToken<Map<String, Integer>>(){}.getType();
        Map<String,Integer> model = objGson.fromJson(result.getResponse().getContentAsString(), listType);
        assertEquals(2, model.get("1").intValue());
        assertEquals(4, model.get("2").intValue());


    }
}
