package com.grasshopper.pfawalletservice.controller;

import com.grasshopper.pfawalletservice.entities.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private Environment environment;

    @RequestMapping("/expenses")
    public List<Expense> getExpenses() {
        List<Expense> expenses = Arrays.asList(
                new Expense("pizza", new BigDecimal("12.05")),
                new Expense("burger", new BigDecimal("2.99"))
        );

        return expenses;
    }

}
