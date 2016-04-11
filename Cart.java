/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author PangKatitum
 */
public class Cart {
    Product[] items = new Product[2];
   public int sumPrice(){
       int sun;
       sun = items[0].getprice() + items[1].getprice();
       return sun;
   }        
            
}
