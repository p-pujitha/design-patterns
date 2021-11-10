/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.singletonpattern.SingletonInstance;

/**
 *
 * @author ppujita5
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {

    }
    
    public static  SingleObject getInstance(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Message in Singleton pattern");
    }
}
