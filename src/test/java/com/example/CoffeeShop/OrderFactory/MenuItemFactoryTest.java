package com.example.CoffeeShop.OrderFactory;

import com.example.CoffeeShop.model.beverages.BeverageFactory;
import com.example.CoffeeShop.model.beverages.addatives.BeverageAddatives;
import com.example.CoffeeShop.model.beverages.types.Beverage;
import com.example.CoffeeShop.model.beverages.types.BeverageSize;
import com.example.CoffeeShop.model.beverages.types.Coffee;
import com.example.CoffeeShop.model.beverages.types.Tea;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MenuItemFactoryTest {

    @Test
    public void makeBeverage() {
        Beverage beverage = new Tea();

        List<Enum> toAdd = Arrays.asList();

        beverage = beverage.withSize(BeverageSize.LARGE);

        //beverage order with empty additives list
        sendBeverageOrder(beverage, toAdd);

        System.out.println("\n");

        beverage = new Coffee();

        toAdd = Arrays.asList(
                BeverageAddatives.ESPRESSO,
                BeverageAddatives.SUGAR,
                BeverageAddatives.CREAM,
                BeverageAddatives.MILK,
                BeverageAddatives.SUGAR
        );

        beverage = beverage.withSize(BeverageSize.MEDIUM);

        //normal beverage order
        sendBeverageOrder(beverage, toAdd);

    }

    private void sendBeverageOrder(Beverage beverage, List<Enum> toAdd){
        BeverageFactory beverageFactory = new BeverageFactory(beverage);
        beverage = beverageFactory.makeBeverageWith(toAdd);

        System.out.println("Your order costs: $"+ beverage.getCost());
        System.out.println("Your order contains: "+ beverage.getDescription());
    }
}