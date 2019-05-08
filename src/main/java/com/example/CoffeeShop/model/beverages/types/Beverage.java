package com.example.CoffeeShop.model.beverages.types;

import com.example.CoffeeShop.model.MenuItem;

public abstract class Beverage extends MenuItem {
    public BeverageSize size = BeverageSize.SMALL; //Default Drink Size

    public Beverage withSize(BeverageSize size){
        this.size = size;
        return this;
    }

    public String sizeAsString(){
        String sizeAsString = "Small";//Default String for default size

        switch (this.size) {
            case SMALL:
                sizeAsString = "Small";
                break;
            case MEDIUM:
                sizeAsString = "Medium";
                break;
            case LARGE:
                sizeAsString = "Large";
                break;
        }
        return sizeAsString;
    }
}
