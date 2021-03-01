package com.example.bootwebtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ErrorController extends AbstractErrorController {

    public ErrorController(ErrorAttributes errorAttributes) {
        super(errorAttributes);
    }

    @RequestMapping("/error")
    @Override
    public String getErrorPath() {
        return "abc";
    }
}
