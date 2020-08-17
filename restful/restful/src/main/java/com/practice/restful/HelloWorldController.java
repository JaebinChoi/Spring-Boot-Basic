package com.practice.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // HTTP 통신 방식 : GET
    // Mapping URI : /hello-world (endpoint)
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // Alt + Enter : 에러 해결
    // Json 형식으로 자동 반환
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }
}
