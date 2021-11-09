/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.abstractfactorypattern.FactoryProducer;

import com.pujitha.abstractfactorypattern.AbstractFactory.AbstractFactory;
import com.pujitha.abstractfactorypattern.AbstractFactoryImpl.RoundedShapeFactory;
import com.pujitha.abstractfactorypattern.AbstractFactoryImpl.ShapeFactory;

/**
 *
 * @author ppujita5
 */
public class FactoryProducer {
    public static  AbstractFactory getFactoryProducer(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
