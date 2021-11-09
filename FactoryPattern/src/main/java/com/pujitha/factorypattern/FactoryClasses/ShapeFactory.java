/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.factorypattern.FactoryClasses;

import com.pujitha.factorypattern.FacImplClasses.Circle;
import com.pujitha.factorypattern.FacImplClasses.Rectangle;
import com.pujitha.factorypattern.FacImplClasses.Triangle;
import com.pujitha.factorypattern.FacInterface.Shape;

/**
 *
 * @author ppujita5
 */
public class ShapeFactory {
    
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        return null;
    }
}
