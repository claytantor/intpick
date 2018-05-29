package org.claytantor.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.claytantor.model.IntpickerModel;
import org.claytantor.service.IntegerPickerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;


/**
 * Created by claytongraham on 5/24/18.
 */
@RestController
public class IntpickerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private IntegerPickerService hashMakerService;


    @ApiOperation(value = "Find integers that equal sum",
            notes = "Retrieving the model for the sum of integers.", response = IntpickerModel.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Success", response = IntpickerModel.class)
    })
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", value="/api/intpicker")
    public ResponseEntity<?> items(@RequestBody IntpickerModel request) {

        logger.debug("IntpickerController.items.POST called.");


        Integer[] intArray = { 2, 4 };
        IntpickerModel response = new IntpickerModel(Arrays.asList(intArray), request.getCount(), request.getSum());



        return new ResponseEntity<IntpickerModel>(response, HttpStatus.OK);
    }
}
