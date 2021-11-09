/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.factorypattern.FactoryPatternDemo;

import com.pujitha.factorypattern.FacImplClasses.Circle;
import com.pujitha.factorypattern.FacImplClasses.Rectangle;
import com.pujitha.factorypattern.FacImplClasses.Triangle;
import com.pujitha.factorypattern.FacInterface.Shape;
import com.pujitha.factorypattern.FactoryClasses.ShapeFactory;

/**
 *
 * @author ppujita5
 */
/*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*/
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("Factory Pattern Demo..");
        Shape rectangle = (Rectangle) shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape triangle = (Triangle) shapeFactory.getShape("Triangle");
        triangle.draw();
        Shape circle = (Circle) shapeFactory.getShape("circle");
        circle.draw();
    }
}
