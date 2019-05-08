package com.example.CoffeeShop.model.beverages.addatives;

import com.example.CoffeeShop.model.beverages.types.Beverage;

import java.math.BigDecimal;

public class Cream extends BeverageAddative {

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(BigDecimal.valueOf(.15));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", with Cream";
    }
}
