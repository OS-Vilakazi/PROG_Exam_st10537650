/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattressguiapp;

/**
 *
 * @author Student
 */
import javax.swing.*;//swing components
import java.awt.*;//layouts
import java.awt.event.*;//events and clickable buttons
import java.io.*;//for file writing

public class MattressAppGUI extends JFrame implements ActionListener {

    //creating JFrame components
    JLabel customer_lbl = new JLabel("Customer Name:");
    JLabel product_lbl = new JLabel("Product:");
    JLabel price_lbl = new JLabel("Price:");
    
    JTextField customer_txtf = new JTextField();
    JTextField price_txtf = new JTextField();
    
    //Combo box for the products
    String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    JComboBox product_combo = new JComboBox(products);
    
    JButton process_btn = new JButton("PROCESS");
    
    //Menu components
    JMenuBar menubar = new JMenuBar();
    JMenu file_menu = new JMenu("File");
    JMenu tools_menu = new JMenu("Tools");
    JMenuItem exit_item = new JMenuItem("Exit");
    JMenuItem process_item = new JMenuItem("Process");
    JMenuItem clear_item = new JMenuItem("Clear");

    //constructor
    public MattressAppGUI() {
        //setting up JFrame
        setTitle("Mattress Sales");
        setSize(350, 250);
        setVisible(true);//so that our frame is visible when we run it
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));//4 rows, 2 columns, with gaps

        //adding components to JFrame
        this.setJMenuBar(menubar);
        menubar.add(file_menu);
        menubar.add(tools_menu);

        file_menu.add(exit_item);
        tools_menu.add(process_item);
        tools_menu.add(clear_item);

        add(customer_lbl);
        add(customer_txtf);
        add(product_lbl);
        add(product_combo);
        add(price_lbl);
        add(price_txtf);
        
        //adding an empty label to push the button to the right side
        add(new JLabel("")); 
        add(process_btn);

        //adding buttons and menu items to action listener
        exit_item.addActionListener(this);
        process_btn.addActionListener(this);
        process_item.addActionListener(this);
        clear_item.addActionListener(this);

    }//end of constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit_item) {
            System.exit(0);
        }//end exit button functionality
        else if (e.getSource() == clear_item) {
            this.customer_txtf.setText("");
            this.price_txtf.setText("");
            this.product_combo.setSelectedIndex(0);
        }//end of clear
        else if (e.getSource() == process_btn || e.getSource() == process_item) {
            
            try {
                //getting data from the form
                String customerName = customer_txtf.getText();
                String productName = product_combo.getSelectedItem().toString();
                //converting the price from String to double
                double price = Double.parseDouble(price_txtf.getText());

                //creating object for ProductCalculations class
                ProductCalculations calc = new ProductCalculations(price);

                //getting calculated values
                double vat = calc.GetVat();
                double commission = calc.GetCommission();
                double total = calc.GetTotal();

                //showing the message dialog as per the sample screenshot
                String message = "Customer Name: " + customerName
                        + "\nProduct: " + productName
                        + "\nVAT: R " + vat
                        + "\nCOMMISSION: R " + commission
                        + "\nTOTAL: R " + total;

                JOptionPane.showMessageDialog(null, message);

                //writing to the text file as per Q.2.3
                FileWriter writer = new FileWriter("data.txt");
                writer.write("**********DATA LOG**********\n"
                        + "Customer Name: " + customerName + "\n"
                        + "Product: " + productName + "\n"
                        + "VAT: R " + vat + "\n"
                        + "COMMISSION: R " + commission + "\n"
                        + "TOTAL: R " + total + "\n"
                        + "****************************\n"
                );
                writer.close();

            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for the price.");
            } catch (IOException error) {
                JOptionPane.showMessageDialog(null, "Error trying to save to the file.");
            }

        }//end of process
    }

}//end of class