package com.example.CoffeeShop.model.beverages.addatives;

import com.example.CoffeeShop.model.beverages.types.Beverage;

//Decorator interface for Beverage additives
public abstract class BeverageAdditive extends Beverage {
    public Beverage beverage;
}
