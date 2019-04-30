package com.test.spring.boot.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller to test Swagger configuration
 */
@RestController
public class EmployeController {

    /**
     * Return all employe
     * @return {@link String}
     */
    @RequestMapping(value = "/employes", method = RequestMethod.GET)
    public String findAllEmploye() {
        return "Une liste exhaustive d'employés";
    }
}
