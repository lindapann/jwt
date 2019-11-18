package com.citihacks19.townhallapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }
}
