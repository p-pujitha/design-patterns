/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern.buildInterfaceImpl;

/**
 *
 * @author ppujita5
 */
public class Coke extends ColdDrink{

    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
    
}
