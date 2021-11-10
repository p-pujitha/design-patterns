/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern.buildInterfaceImpl;

/**
 *
 * @author ppujita5
 */
public class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
    
}
