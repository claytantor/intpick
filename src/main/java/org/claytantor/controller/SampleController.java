package org.claytantor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by claytongraham on 5/24/18.
 */
@Controller
public class SampleController {
    @RequestMapping("/sample")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
