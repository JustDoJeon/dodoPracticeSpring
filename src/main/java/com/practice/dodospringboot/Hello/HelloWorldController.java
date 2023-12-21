package com.practice.dodospringboot.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping( "/helloworld")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloWorld-bean")
    public UserDetails helloWorldBean() {
        return new UserDetails("dodo","Reddy","Hyderabad");
    }


}
