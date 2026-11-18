/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student Gemini was used to create the unit testing
 */
public class ProductSalesTest {

    @Test
    public void testCalculateTotalSales() {
        // Arrange: Create a sample 3x3 2D array simulating 3 months and 3 products
        int[][] sampleSales = {
            {10, 20, 30}, // Month 1
            {15, 25, 35}, // Month 2
            {5,  10, 15}  // Month 3
        };

        int expectedTotal = 165; // 10+20+30+15+25+35+5+10+15
        int actualTotal = 0;

        // Act: Compute total sales using nested loops
        for (int i = 0; i < sampleSales.length; i++) {
            for (int j = 0; j < sampleSales[i].length; j++) {
                actualTotal += sampleSales[i][j];
            }
        }

     
        assertEquals(expectedTotal, actualTotal, "Total sales calculation is incorrect");
    }

    @Test
    public void testCalculateAverageSales() {
        // Arrange
        int totalSales = 165;
        int totalEntries = 9; // 3 months x 3 products
        
        double expectedAverage = 18.3333; // 165 / 9

        // Act
        double actualAverage = (double) totalSales / totalEntries;

        // Assert: JUnit 5 format for doubles requires delta (expected, actual, delta, message)
        assertEquals(expectedAverage, actualAverage, 0.01, "Average sales calculation is incorrect");
    }
}
    

