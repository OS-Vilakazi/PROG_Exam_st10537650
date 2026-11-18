/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author Student
 */
public class PrintProduct extends ProductSales {
    
    public PrintProduct(String month, String product, int TotalProductsSold, int AverageProductsSold, String MostProductsSold) {
        super(month, product, TotalProductsSold, AverageProductsSold, MostProductsSold);
    }
    
    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("********************\n");
        System.out.println("TOTAL PRODUCT SALES " + GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT: " + GetMostPopularProduct());
    
}
}