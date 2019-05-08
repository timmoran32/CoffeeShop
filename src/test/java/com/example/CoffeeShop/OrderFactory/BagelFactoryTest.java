package com.example.CoffeeShop.OrderFactory;

import com.example.CoffeeShop.model.bagels.BagelFactory;
import com.example.CoffeeShop.model.bagels.BagelTypes.Bagel;
import com.example.CoffeeShop.model.bagels.BagelTypes.SesameBagel;
import com.example.CoffeeShop.model.bagels.Toppings.Topping;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BagelFactoryTest {

    @Test
    public void makeBagels() {

        Bagel bagel = new SesameBagel();

        BagelFactory factory = new BagelFactory(bagel);
        List<Enum> toppings = Arrays.asList(Topping.CREAM_CHEESE, Topping.TOASTED);
        //bagel = factory.makeBagelWith(toppings);

        //System.out.println("Your order of "+ bagel.getDescription()+" costs: $"+bagel.getCost());
        assertEquals("Bagel price should be 2.25" , BigDecimal.valueOf(2.25), bagel.getCost());
        assertEquals("message should be \"Sesame bagel\"", "Sesame bagel", bagel.getDescription());
    }
}