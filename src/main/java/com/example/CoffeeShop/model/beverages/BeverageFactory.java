package com.example.CoffeeShop.model.beverages;

import com.example.CoffeeShop.model.beverages.addatives.*;
import com.example.CoffeeShop.model.beverages.types.Beverage;

import java.util.Collections;
import java.util.List;

public class BeverageFactory {

    private Beverage beverage;

    public BeverageFactory(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage makeBeverageWith(List<Enum> addatives){
        Collections.sort(addatives);

        for (Enum addative:addatives){
            if (addative == BeverageAddatives.CREAM){
                beverage = new Cream(beverage);
            }
            if (addative == BeverageAddatives.MILK){
                beverage = new Milk(beverage);
            }
            if (addative == BeverageAddatives.SUGAR){
                beverage = new Sugar(beverage);
            }
            if (addative == BeverageAddatives.ESPRESSO){
                beverage = new Espresso(beverage);
            }
        }

        return beverage;
    }


}
