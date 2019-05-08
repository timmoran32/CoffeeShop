package com.example.CoffeeShop.model;

import java.math.BigDecimal;

public abstract class MenuItem {

    public String description = "Base Description";
    public BigDecimal cost = BigDecimal.valueOf(0); //BigDecimal helps avoid rounding issues that may arise with doubles
    public abstract BigDecimal getCost();
    public abstract String getDescription();
    public ItemType itemType;

}
