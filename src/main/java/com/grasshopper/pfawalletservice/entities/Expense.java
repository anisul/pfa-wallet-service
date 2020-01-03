package com.grasshopper.pfawalletservice.entities;

import java.math.BigDecimal;

public class Expense {
    String description;
    BigDecimal amount;

    public Expense(String description, BigDecimal amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
