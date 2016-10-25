/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import javax.swing.JOptionPane;

      
public class operations {
    public static double add(double x)
    {
        double y =  Double.parseDouble(JOptionPane.showInputDialog("دخل القم التاني يا اسطا"));
        return x+y;
        
    }
 public static double min(double x)
    {
        double y =  Double.parseDouble(JOptionPane.showInputDialog(""));
        return x-y;
        
    }
 
     public static double xx(double x)
    {
          double y =  Double.parseDouble(JOptionPane.showInputDialog(""));
        return x*y;
        
    }
      public static double dvide (double x)
    {
        double y =  Double.parseDouble(JOptionPane.showInputDialog(""));
        return x/y;
        
    }
}
