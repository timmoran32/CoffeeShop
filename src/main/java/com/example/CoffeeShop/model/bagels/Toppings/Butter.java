package com.example.CoffeeShop.model.bagels.Toppings;

import com.example.CoffeeShop.model.bagels.BagelTypes.Bagel;

import java.math.BigDecimal;

public class Butter extends BagelTopping {

    public Butter(Bagel bagel) {
        this.bagel = bagel;
    }

    @Override
    public BigDecimal getCost() {
        return bagel.getCost().add(BigDecimal.valueOf(.45));
    }

    @Override
    public String getDescription() {
        return bagel.getDescription()+", with Butter";
    }
}
