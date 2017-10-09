package Jakir.com.ta;
import java.io.File;
public class TestFile {
    public static void main(String[] args) throws Exception {
        File newFile = new File("my file.txt");
       printFileDetails(newFile); 
       
       boolean fileCreated =newFile.createNewFile();
       if(!fileCreated){
           System.out.println(newFile+""); 
           
           //delete
           
           newFile.delete();
           System.out.println("After deleteing");
            printFileDetails(newFile);
            
            //create
            
            newFile.createNewFile();
            printFileDetails(newFile);
            
            //let's tell JVM ton delete this file on exit
             newFile.deleteOnExit();
             System.out.println("After using deletOnExit() method:");
              printFileDetails(newFile);
              
              //create a new file rename it
              File firstFile = new File("my first file.txt");
              File secondFile = new File("my second file.txt");
              boolean filCreated = firstFile.createNewFile();
              if(filCreated || firstFile.exists()){
                  printFileDetails(firstFile);
                  printFileDetails(secondFile);
                  
                  boolean renameFlag = firstFile.renameTo(secondFile);
                  if(!renameFlag){
                      System.out.println("Coud not rename "+firstFile);
                  }
                 printFileDetails(newFile);  
              printFileDetails(secondFile);
              }
              
       }
    }
    public static void printFileDetails(File f){
	System.out.println("Absoluat path:"+f.getAbsolutePath());
        System.out.println("file exits:"+f.exists());
}
}
