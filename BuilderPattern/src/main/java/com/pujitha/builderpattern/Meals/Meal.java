/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern.Meals;

import com.pujitha.builderpattern.buildInterface.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ppujita5
 */
public class Meal {

    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float totalPrice = 0.0f;
        for (Item item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void printItems() {

        for (Item item : items) {
            System.out.println("Item Name :" + item.name());
            System.out.println("Item Price :" + item.price());
            System.out.println("Item Packing Type :" + item.packing().pack());

        }
    }

}
