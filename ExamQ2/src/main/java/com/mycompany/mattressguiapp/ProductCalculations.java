/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattressguiapp;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations {

    //variables to store the calculations
    private double productPrice;
    //VAT is 15% and Commission is fixed at 175.0 as per the example
    private final double VAT_RATE = 0.15; 
    private final double COMMISSION = 175.0;

    //constructor to receive the product price
    public ProductCalculations(double price) {
        this.productPrice = price;
    }

    //calculate and return the VAT amount
    @Override
    public double GetVat() {
        return productPrice * VAT_RATE;
    }

    //return the fixed commission
    @Override
    public double GetCommission() {
        return COMMISSION;
    }

    //calculate and return the total sale amount
    @Override
    public double GetTotal() {
        return productPrice + GetVat() + GetCommission();
    }

}
