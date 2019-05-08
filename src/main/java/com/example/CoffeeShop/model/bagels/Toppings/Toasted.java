package com.example.CoffeeShop.model.bagels.Toppings;

import com.example.CoffeeShop.model.bagels.BagelTypes.Bagel;

import java.math.BigDecimal;

public class Toasted extends BagelTopping {

    public Toasted(Bagel bagel) {
        this.bagel = bagel;
    }

    @Override
    public BigDecimal getCost() {
        return bagel.getCost();
    }

    @Override
    public String getDescription() {
        return bagel.getDescription()+", Toasted";
    }
}
