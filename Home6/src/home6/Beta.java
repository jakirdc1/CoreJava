/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home6;

/**
 *
 * @author MD. Jakir
 */

    public class Beta extends Alpha { 
public void foo() { System.out.print("Bfoo "); } 
 public static void main(String[] args) { 
 Alpha a = new Beta(); 
 Beta b = (Beta)a; 
 a.foo(); 
 b.foo(); 
 } 
}   


