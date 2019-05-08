package com.example.CoffeeShop.model.bagels.Toppings;

import com.example.CoffeeShop.model.bagels.BagelTypes.Bagel;

import java.math.BigDecimal;

public class CreamCheese extends BagelTopping {

    public CreamCheese(Bagel bagel) {
        this.bagel = bagel;
    }

    @Override
    public BigDecimal getCost() {
        return bagel.getCost().add(BigDecimal.valueOf(.65));
    }

    @Override
    public String getDescription() {

        return bagel.getDescription()+", with Cream Cheese";
    }
}
