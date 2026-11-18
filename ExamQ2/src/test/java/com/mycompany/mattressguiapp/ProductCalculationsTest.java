/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mattressguiapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student and i used ai to create j unit testing 
 */
public class ProductCalculationsTest {

    //Unit Test 1: GetVat_WithValidData_ReturnsCorrectValue()
    @Test
    public void GetVat_WithValidData_ReturnsCorrectValue() {
        //For a product of R1000, VAT at 15% should be R150
        ProductCalculations calc = new ProductCalculations(1000.0);
        double expectedVat = 150.0;
        
        // We use 0.01 delta because double calculations can have tiny precision errors
        assertEquals(expectedVat, calc.GetVat(), 0.01);
    }

    //Unit Test 2: GetTotal_WithValidData_ReturnsCorrectValue()
    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        //Using the sample screenshot data: Price is 3500
        //VAT = 525.0, Commission = 175.0, Total = 4200.0
        ProductCalculations calc = new ProductCalculations(3500.0);
        double expectedTotal = 4200.0;
        
        assertEquals(expectedTotal, calc.GetTotal(), 0.01);
    }
}
