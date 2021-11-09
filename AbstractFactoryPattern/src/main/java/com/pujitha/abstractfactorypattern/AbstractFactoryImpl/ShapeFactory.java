/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.abstractfactorypattern.AbstractFactoryImpl;

import com.pujitha.abstractfactorypattern.AbstractFactory.AbstractFactory;
import com.pujitha.abstractfactorypattern.facInterfaceImpl.Circle;
import com.pujitha.abstractfactorypattern.facInterfaceImpl.Rectangle;
import com.pujitha.abstractfactorypattern.factInterfaces.Shape;

/**
 *
 * @author ppujita5
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }
    
}
