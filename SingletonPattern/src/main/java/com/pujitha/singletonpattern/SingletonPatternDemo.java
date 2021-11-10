/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.singletonpattern;

import com.pujitha.singletonpattern.SingletonInstance.SingleObject;

/**
 *
 * @author ppujita5
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject singleton = SingleObject.getInstance();
        singleton.showMessage();
    }
}
