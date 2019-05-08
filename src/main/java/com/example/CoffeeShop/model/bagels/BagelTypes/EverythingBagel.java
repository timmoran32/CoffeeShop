package com.example.CoffeeShop.model.bagels.BagelTypes;

import java.math.BigDecimal;

public class EverythingBagel extends Bagel {
    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(2.65);
    }

    @Override
    public String getDescription() {
        return "Everything Bagel";
    }
}
