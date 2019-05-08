package com.example.CoffeeShop.model.beverages.types;

import java.math.BigDecimal;

public class Tea extends Beverage {

    @Override
    public BigDecimal getCost() {
        if (size == BeverageSize.SMALL)
            this.cost = BigDecimal.valueOf(2.00);
        if (size == BeverageSize.MEDIUM)
            this.cost = BigDecimal.valueOf(2.25);
        if (size == BeverageSize.LARGE)
            this.cost = BigDecimal.valueOf(2.50);

        return cost;
    }

    @Override
    public String getDescription() {
        return sizeAsString()+" Fresh Brewed Tea";
    }

}
