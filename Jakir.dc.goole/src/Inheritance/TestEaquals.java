
package Inheritance;
public class TestEaquals {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(14, 3, 1976);
         MyDate date2 = new MyDate(14, 3, 1976);
         
         System.out.println("This is Example");
           System.out.println("-------output---------");
         
         if(date1 == date2){
             System.out.println("date1 is identical to date2");     
         }else{        
         System.out.println("date1 is not identical to date2");
         }
         
       if(date1.equals(date2)){
       System.out.println("date1 is identical to date2");
       }else{
       System.out.println("date1 is not identical to date2");
             
       }
       
    System.out.println("Set date2 == date1;");
    date2 = date1;
    
    if(date1 == date2){
    
   System.out.println("date1 is identical to date2"); 
    }else{
    
   System.out.println("date1 is not identical to date2"); 
    }
    }
}
