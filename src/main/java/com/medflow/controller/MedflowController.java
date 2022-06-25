package com.medflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class MedflowController {
    @GetMapping
    public String healthCheck() {

        return "MedFlow is up and running!!! ";
    }
}
