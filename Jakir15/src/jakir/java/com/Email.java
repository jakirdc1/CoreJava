
package jakir.java.com;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email");
     String email = sc.nextLine();   
        int atops= email.indexOf("@");
        int dotops = email.lastIndexOf(".");
                
                if(atops>1 && (dotops - atops)>2 ){
                    System.out.println("Email is valid");
                }else{
                    System.out.println("Not valid ");
                }
    }
}
