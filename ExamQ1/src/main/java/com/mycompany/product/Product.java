/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.product;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Product {

    public static void main(String[] args) {//START
        Scanner sc = new Scanner(System.in);

     // Single-dimensional arrays
        String[] month = {"Month 1","Month 2", "Month 3"};
        String[] product = {"Cozy Nights Monarch Mattress", "Restonic Barbados mattress", "Sealy Phuket mattress"};

        // 2D array for mattress sales
        int[][] sales = new int[3][3];

        
        
        // input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the number of sales for " + month[j] + " for " + product[i] + ": ");
                sales[i][j] = sc.nextInt();
            }
        }

        // Calculate Total Product Sales and individual product totals
        int totalSales = 0;
        int[] productTotals = new int[3]; // Stores total sales for each of the 3 mattresses

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalSales += sales[i][j];
                productTotals[j] += sales[i][j]; // Add sale to the specific product column (j)
            }
        }

        // Calculate Average Product Sales (9 total entries across 3 months x 3 products)
        int averageSales = totalSales / 9;

        // Find the Most Popular Product (highest total sales)
        int maxSales = productTotals[0];
        String mostPopularProduct = product[0];

        for (int j = 1; j < 3; j++) {
            if (productTotals[j] > maxSales) {
                maxSales = productTotals[j];
                mostPopularProduct = product[j];
            }
        }

        //PrintProduct object and print the report
        PrintProduct report = new PrintProduct("", "", totalSales, averageSales, mostPopularProduct);
        report.printReport();
        
    }
}//END
