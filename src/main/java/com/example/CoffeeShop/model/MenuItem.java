package com.example.CoffeeShop.model;

import java.math.BigDecimal;

public abstract class MenuItem {

    public String description = "Base Description";
    public BigDecimal cost = BigDecimal.valueOf(0);
    public abstract BigDecimal getCost();
    public abstract String getDescription();
    public ItemType itemType;

}
