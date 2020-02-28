package com.example.logrequestresponse.controller;

import com.example.logrequestresponse.model.GreetingRequest;
import com.example.logrequestresponse.model.GreetingResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vibol rim
 */
@RestController
public class TestController {


    @GetMapping("greetings/{id}")
    public GreetingResponse getGreeting(@PathVariable("id") Long id) {
        GreetingResponse greetingResponse = new GreetingResponse();
        greetingResponse.setId("1");
        greetingResponse.setMessage("Hello from response");
        return greetingResponse;
    }

    @PostMapping("greetings")
    public GreetingResponse createGreeting(@RequestBody GreetingRequest greetingRequest) {
       greetingRequest.setMessage("Hi  Said from Requester");

       GreetingResponse response = new GreetingResponse();
       //response.setMessage();
        return response ;
    }
}
