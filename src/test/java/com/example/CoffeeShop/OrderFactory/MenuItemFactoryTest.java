package com.example.CoffeeShop.OrderFactory;

import com.example.CoffeeShop.model.beverages.BeverageFactory;
import com.example.CoffeeShop.model.beverages.addatives.BeverageAdditives;
import com.example.CoffeeShop.model.beverages.types.Beverage;
import com.example.CoffeeShop.model.beverages.types.BeverageSize;
import com.example.CoffeeShop.model.beverages.types.Coffee;
import com.example.CoffeeShop.model.beverages.types.Tea;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MenuItemFactoryTest {

    @Test
    public void makeBeverage() {
        Beverage beverage = new Tea();

        List<Enum> toAdd = Arrays.asList();

        beverage = beverage.withSize(BeverageSize.LARGE);

        //beverage order with empty additives list
        BeverageFactory beverageFactory = new BeverageFactory(beverage);
        beverage = beverageFactory.makeBeverageWith(toAdd);

        assertEquals("Your bagel should costs: 2.5", BigDecimal.valueOf(2.5) , beverage.getCost().stripTrailingZeros());
        assertEquals("Your order should read \"Large Fresh Brewed Tea\"", "Large Fresh Brewed Tea", beverage.getDescription());


        beverage = new Coffee();

        toAdd = Arrays.asList(
                BeverageAdditives.ESPRESSO,
                BeverageAdditives.SUGAR,
                BeverageAdditives.CREAM,
                BeverageAdditives.SUGAR
        );

        beverage = beverage.withSize(BeverageSize.MEDIUM);

        //normal beverage order
        beverageFactory = new BeverageFactory(beverage);
        beverage = beverageFactory.makeBeverageWith(toAdd);

        assertEquals("Your bagel should costs: 3.1", BigDecimal.valueOf(3.1) , beverage.getCost().stripTrailingZeros());
        assertEquals(
                "Your order should read \"Medium House Blend Coffee, with Cream, with Milk, with Sugar, with Sugar, with Espresso shot\"",
                "Medium House Blend Coffee, with Cream, with Sugar, with Sugar, with Espresso shot",
                beverage.getDescription()
        );


    }


}