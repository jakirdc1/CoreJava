/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jakir.comE;

import java.util.Scanner;

/**
 *
 * @author MD. Jakir
 */
public class Prime {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
         n=sc.nextInt();
         
          int a=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                a++;
            }
        }
        if(a==2){
            System.out.println(n+"  number is prime");
        }else{
            System.out.println("number is not prime "+n);
        }
}
}