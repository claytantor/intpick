package org.claytantor.controller;

import org.claytantor.model.IntpickerRequest;
import org.claytantor.service.HashMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by claytongraham on 5/24/18.
 */
@RestController("/intpicker")
public class IntpickerController {


    @Autowired
    private HashMakerService hashMakerService;

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> items(@RequestBody IntpickerRequest request) {


        //get the hash





        Map<Integer,Integer> response = new HashMap<>();
        response.put(1,2);
        response.put(2,4);
        return new ResponseEntity<Map<Integer,Integer>>(response, HttpStatus.OK);
    }
}
