package com.nzj.myconsulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyConsulClientAApplication {

    @RequestMapping("/")
    public String hello() {
        return "hello this is my-consul-client-a";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyConsulClientAApplication.class, args);
    }

}
