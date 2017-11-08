/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.business;

/**
 *
 * @author cice
 */
public interface ICalculadora {

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    public double suma(double num1, double num2);

    public double resta(double num1, double num2);

    public double multiplicacion(double num1, double num2);

    public double division(double num1, double num2);

}
