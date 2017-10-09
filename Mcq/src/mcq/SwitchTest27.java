
package mcq;

public class SwitchTest27 {
    public static void main(String[] args) {
        System.out.println("value = "+switchIt(2));
    }
 public static int switchIt(int x){
 int j =2;
 switch(x){
     case 1: j++;
     case 2: j++;
     case 3: j++;
     break;
     case 4: j++;
     case 5: j++;
     default : j++;
 
 }
 return j +x;
 
 }
}
