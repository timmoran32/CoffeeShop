package com.example.CoffeeShop.model.beverages.addatives;

import com.example.CoffeeShop.model.beverages.types.Beverage;

import java.math.BigDecimal;

public class Sugar extends BeverageAdditive {

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(BigDecimal.valueOf(.10));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", with Sugar";
    }
}
