package com.example.CoffeeShop.model.bagels.BagelTypes;

import java.math.BigDecimal;

public class SesameBagel extends Bagel {
    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(2.25);
    }

    @Override
    public String getDescription() {
        return "Sesame bagel";
    }
}
