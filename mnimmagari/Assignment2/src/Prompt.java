import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
//import java.io.IOException;
public class Prompt {
	public static void main(String[] args) throws Exception {
		String fName = "D:\\GIT\\SortedCsv.csv";
	    String thisLine;
	    Scanner in = new Scanner(System.in);
        System.out.println("search by id number ");
         String input= in.next();
	    BufferedReader br = new BufferedReader(new FileReader(fName));
   while ((thisLine = br.readLine()) != null) {
	        String strar[] = thisLine.split(",");
	            if(input.equalsIgnoreCase(strar[0])){
	                System.out.println(thisLine);
	                
	                	in.close();
	                br.close();
	          
	                }
	        }
	}
	}

