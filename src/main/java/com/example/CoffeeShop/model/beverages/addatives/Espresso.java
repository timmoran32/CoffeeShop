package com.example.CoffeeShop.model.beverages.addatives;

import com.example.CoffeeShop.model.beverages.types.Beverage;

import java.math.BigDecimal;

public class Espresso extends BeverageAdditive {

    public Espresso(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(BigDecimal.valueOf(1.00));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", with Espresso shot";
    }
}
