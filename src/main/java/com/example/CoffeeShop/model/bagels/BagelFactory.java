package com.example.CoffeeShop.model.bagels;

import com.example.CoffeeShop.model.bagels.BagelTypes.Bagel;
import com.example.CoffeeShop.model.bagels.Toppings.Butter;
import com.example.CoffeeShop.model.bagels.Toppings.CreamCheese;
import com.example.CoffeeShop.model.bagels.Toppings.Toasted;
import com.example.CoffeeShop.model.bagels.Toppings.Topping;

import java.util.Collections;
import java.util.List;

public class BagelFactory {

    private Bagel bagel;

    public BagelFactory(Bagel bagel) {
        this.bagel = bagel;
    }

    public Bagel makeBagelWith(List<Topping> addatives){
        Collections.sort(addatives);

        for (Enum toppping: addatives){

            if (toppping == Topping.CREAM_CHEESE){
                bagel = new CreamCheese(bagel);
            }
            if (toppping == Topping.BUTTER){
                bagel = new Butter(bagel);
            }
            if (toppping == Topping.TOASTED){
                bagel = new Toasted(bagel);
            }

        }

        return bagel;
    }
}
