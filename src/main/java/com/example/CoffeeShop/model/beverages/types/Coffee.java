package com.example.CoffeeShop.model.beverages.types;

import java.math.BigDecimal;

public class Coffee extends Beverage {

    @Override
    public BigDecimal getCost() {
        if (size == BeverageSize.SMALL)
            this.cost = BigDecimal.valueOf(1.50);
        if (size == BeverageSize.MEDIUM)
            this.cost = BigDecimal.valueOf(1.75);
        if (size == BeverageSize.LARGE)
            this.cost = BigDecimal.valueOf(2.00);

        return cost;
    }

    @Override
    public String getDescription() {
        return sizeAsString()+" House Blend Coffee";
    }
}
