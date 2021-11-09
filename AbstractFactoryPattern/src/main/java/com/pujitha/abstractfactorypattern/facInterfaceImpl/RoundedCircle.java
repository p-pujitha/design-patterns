/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.abstractfactorypattern.facInterfaceImpl;

import com.pujitha.abstractfactorypattern.factInterfaces.Shape;

/**
 *
 * @author ppujita5
 */
public class RoundedCircle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rounded Circle... Draw()");
    }

}
