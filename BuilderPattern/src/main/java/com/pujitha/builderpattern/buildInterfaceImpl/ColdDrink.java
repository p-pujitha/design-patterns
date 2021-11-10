/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern.buildInterfaceImpl;

import com.pujitha.builderpattern.buildInterface.Item;
import com.pujitha.builderpattern.buildInterface.Packing;

/**
 *
 * @author ppujita5
 */
public abstract class ColdDrink implements Item{
    
    @Override
    public Packing packing(){
        return new Bottle();
    }
    
    @Override
    public abstract float price();
}
