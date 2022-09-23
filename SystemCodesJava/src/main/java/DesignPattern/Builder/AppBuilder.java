package DesignPattern.Builder;

import javax.swing.JOptionPane;

public class AppBuilder{
    
    public static void main(String[] args){

        Product product = new Product.Builder(1L)            
            .name("Rockport")
            .size("1.98")
            .build();
        
        JOptionPane.showMessageDialog(null, "Name: " + product.getName() + "\nSize: " + product.getSize());
    }
}