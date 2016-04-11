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
public class Testairplane {
    public static void main(String[] args) {
        Flyable f = new Bird();
       fly(f);
       chackprice();
       
    }
    public static void fly(Flyable f) {
        f = new Bird();
        System.out.println(f.fly());
        f = new Airplane();
        System.out.println(f.fly());
    }
    public static void chackprice(){
        Product m = new Cdr();
        Product t = new Toothpick();
        Cart carts = new Cart();
        carts.items[0]=m;
        carts.items[1]=t;
        System.out.println(carts.sumPrice());
    }
}
