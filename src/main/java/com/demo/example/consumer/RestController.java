package com.demo.example.consumer;

import com.demo.example.aop.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Routes the requests this service receives and call the mapped method to the route.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    /**
     * To display at the webpage and acts as consumer of the aspect. The business logic of aspect is executed without affecting the functionality of this method.
     *
     * @return a string to display at the webpage.
     */
    @ExceptionHandler()
    @GetMapping
    public String getData() {
        return "Base functionality of the called method.";
    }
}