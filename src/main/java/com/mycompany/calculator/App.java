/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

/**
 *
 * @author DELL
 */
public class App 
{
    public static void main(String []args)
    {
        Calculator cal = new Calculator();
        
        int num1 = 6;
        int num2 = 2;
        
        int sum = cal.add(num1, num2);
        System.out.println(num1 + "+" + num2 + "=" + cal.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + cal.subtract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" + cal.multiply(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + cal.divide(num1, num2));
    }
}
