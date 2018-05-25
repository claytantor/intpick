package org.claytantor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by claytongraham on 5/24/18.
 */
@RestController("/healthcheck")
public class HealthcheckController {
    @RequestMapping(method=RequestMethod.GET)
    public String healthcheck() {
        return "All is well in the world.";
    }
}
