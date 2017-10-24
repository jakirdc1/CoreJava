
import java.io.*;


public class IOEx {
    public static void main(String[] args)throws IOException{
			//Scanner sc =new Scanner (System.in);
		   // System.out.println("Enter write something :");
		    //String a =sc.nextLine();
			
		try{
			String outputFile="D:/Jakir1/text2.txt";
			File myFile = new File(outputFile);
			boolean b1 = myFile.createNewFile();
			FileWriter fw= new FileWriter(myFile);
			BufferedWriter bw= new BufferedWriter(fw);
		        PrintWriter pw= new PrintWriter(bw);
			if(b1){
				System.out.println("File is created");
			}else{
				System.out.println("File is not created");
			}
			
			
			//create input file
			
			
			String inputFile="G:\\pratise java\\Anis.txt";
			File myFile1 = new File(inputFile);
			FileReader fr= new FileReader(myFile1);
			BufferedReader br= new BufferedReader(fr);
                       // PrintReader pr=new PrintReader(br);
			String s;
			s=br.readLine();	
	              while (s!=null){
					pw.write(s);
					s=br.readLine();
				}
			System.out.println("File is save");
			
			br.close();
			pw.flush();
			pw.close();
			
		}catch(IOException ioe){
			System.out.println("Check input output");
		}
    

