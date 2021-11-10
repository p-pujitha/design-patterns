/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.builderpattern.buildInterfaceImpl;

import com.pujitha.builderpattern.buildInterface.Packing;

/**
 *
 * @author ppujita5
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
    
}
