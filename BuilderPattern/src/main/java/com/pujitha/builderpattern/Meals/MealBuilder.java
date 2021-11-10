/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern.Meals;

import com.pujitha.builderpattern.buildInterfaceImpl.ChickenBurger;
import com.pujitha.builderpattern.buildInterfaceImpl.Coke;
import com.pujitha.builderpattern.buildInterfaceImpl.Pepsi;
import com.pujitha.builderpattern.buildInterfaceImpl.VegBurger;

/**
 *
 * @author ppujita5
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
