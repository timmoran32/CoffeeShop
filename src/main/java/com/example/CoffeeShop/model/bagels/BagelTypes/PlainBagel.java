package com.example.CoffeeShop.model.bagels.BagelTypes;

import java.math.BigDecimal;

public class PlainBagel extends Bagel {
    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(2.05);
    }

    @Override
    public String getDescription() {
        return "Plain Bagel";
    }
}
