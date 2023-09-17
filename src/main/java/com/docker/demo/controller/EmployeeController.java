package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee")
    public String getEmployee() {
        return "Docker example worked";

    }
}
