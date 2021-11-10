/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern;

import com.pujitha.builderpattern.Meals.Meal;
import com.pujitha.builderpattern.Meals.MealBuilder;

/**
 *
 * @author ppujita5
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder =  new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        meal.printItems();
        System.out.println("Total VegMeal Cost :" + meal.getCost());
        
        Meal meal2 = mealBuilder.prepareNonVegMeal();
        meal2.printItems();
        System.out.println("Toal Non veg meal cost :"+ meal2.getCost());
    }
}
