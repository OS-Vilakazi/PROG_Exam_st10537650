/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author Student
 */
public abstract class ProductSales implements IProduct {//start
    private String month;
    private String product;
    private int TotalProductsSold;
    private double AverageProductsSold;
    private String MostProductsSold;
    
    public ProductSales(String month,String product,int TotalProductsSold,int AverageProductsSold,String MostProductsSold){
        this.month = month;
        this.product = product;
        this.TotalProductsSold = TotalProductsSold;
        this.AverageProductsSold = AverageProductsSold;
        this.MostProductsSold = MostProductsSold;
    
    }
    
    @Override
    public String getMonth() {
        return month;
    }

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public int GetTotalProductsSold() {
        return TotalProductsSold;
    }
    
    @Override
    public double GetAverageProductSold() {
        return AverageProductsSold;
    }
    
    @Override
    public String GetMostPopularProduct() {
        return MostProductsSold;
    }
}//end
