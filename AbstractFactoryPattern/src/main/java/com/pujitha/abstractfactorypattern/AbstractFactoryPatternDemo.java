/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.abstractfactorypattern;

import com.pujitha.abstractfactorypattern.AbstractFactory.AbstractFactory;
import com.pujitha.abstractfactorypattern.AbstractFactoryImpl.ShapeFactory;
import com.pujitha.abstractfactorypattern.FactoryProducer.FactoryProducer;
import com.pujitha.abstractfactorypattern.factInterfaces.Shape;

/**
 *
 * @author ppujita5
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactoryProducer(false);
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactoryProducer(true);
        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        roundedRectangle.draw();
        Shape roundedCircle = roundedShapeFactory.getShape("Circle");
        roundedCircle.draw();
    }
}
