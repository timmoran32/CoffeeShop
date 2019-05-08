package com.example.CoffeeShop.model.beverages.addatives;

import com.example.CoffeeShop.model.beverages.types.Beverage;

import java.math.BigDecimal;

public class Milk extends BeverageAddative {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(BigDecimal.valueOf(.20));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", with Milk";
    }
}
