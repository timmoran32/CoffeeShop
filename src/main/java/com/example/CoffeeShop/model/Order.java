package com.example.CoffeeShop.model;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class Order {

    private ZonedDateTime placedTime;
    private ItemType type;
    @Generated
    private final String orderNumber = UUID.randomUUID().toString();

}