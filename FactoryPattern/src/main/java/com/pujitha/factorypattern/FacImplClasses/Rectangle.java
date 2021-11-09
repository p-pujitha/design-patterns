/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.factorypattern.FacImplClasses;

import com.pujitha.factorypattern.FacInterface.Shape;

/**
 *
 * @author ppujita5
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw ---- Rectangle!!");
    }
    
}
