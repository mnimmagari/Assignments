import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.lang.StringBuffer;
//import java.util.StringTokenizer;
//import java.util.ArrayList;
//import java.util.List;
import java.io.PrintWriter;
//import com.csvreader.CsvReader;
//import com.csvreader.CsvWriter;

public class Add 
{
	public static void main( String[] args ) throws IOException
	{	
		Scanner input = new Scanner(System.in);
		System.out.println(" 1. Enter id to get Details"+"\n 2. Add the record"+ "\n 3. Delete a record by id" +"\n Enter ur choice");

		int choice = input.nextInt();
		CsvOperations csvOperations = new CsvOperations();

		switch (choice) {
		case 1:
			csvOperations.fetchRecord();
			break;
		case 2:
			csvOperations.addRecord();
			break;
		case 3: 
			csvOperations.deleteRecord();
			break;

		default:
			System.out.println("invalid option");
			break;
		
		}
		input.close();
	
	}
}

class CsvOperations {
	String [][] data = new String[102][10];
	public void addRecord(){

		Scanner input = new Scanner(System.in);
		File infile=new File("D:\\GIT\\SortedCSv.csv");
		
		 System.out.println("Enter ID to add  that record from CSV File");
				   System.out.println("1.add the row above "+"\n2.add the row below "+"\n3.add on that particular position type position");
				   String choice = input.nextLine();
					switch (choice)
					{
					case "1":
						System.out.println("Enter the id no above which you want to enter the record");
						String m=input.nextLine();
						
						
						System.out.println("enter id ");
						String id4=input.nextLine();
						System.out.println("enter firstname ");
						String Firstname=input.nextLine();
						System.out.println("enter lastanme");

						String lastname=input.nextLine();
						System.out.println("enter age");
						String age=input.nextLine();
						System.out.println("email");
						String email=input.nextLine();
						System.out.println("ipaddress ");
						String ipaddress=input.nextLine();
						System.out.println("country ");
						String country=input.nextLine();
						System.out.println("order ");
						String order=input.nextLine();
						System.out.println("color ");
						String color=input.nextLine();
						try 
						{
						insertStringInFile(infile, m, id4,Firstname,lastname,age,email,country,ipaddress,order,color);
					    }

						catch (Exception e) 
						{
						   e.printStackTrace();
					    }

						break;

					case "2":
						System.out.println("Enter the id no below which you want to enter the record");
						String id7=input.nextLine();
						System.out.println("enter id ");
						String id5=input.nextLine();
						System.out.println("enter firstname ");
						String Firstname1=input.nextLine();
						System.out.println("enter lastanme");

						String lastname1=input.nextLine();
						System.out.println("enter age");
						String age1=input.nextLine();
						System.out.println("email");
						String email1=input.nextLine();
						System.out.println("ipaddress ");
						String ipaddress1=input.nextLine();
						System.out.println("country ");
						String country1=input.nextLine();
						System.out.println("order ");
						String order1=input.nextLine();
						System.out.println("color ");
						String color1=input.nextLine();
					try 
						{
						insertStringInFile2(infile, id7, id5,Firstname1,lastname1,age1,email1,country1,ipaddress1,order1,color1);
					    }

						catch (Exception e) 
						{
						   e.printStackTrace();
					    }
						break;
					case "3":
						System.out.println("Enter the line no at which you want to enter the record");
					    String lineno1;
						lineno1=input.nextLine();
						int lineno=Integer.parseInt(lineno1);
						lineno++;
						System.out.println("enter id ");
						String id6=input.nextLine();
						System.out.println("enter firstname ");
						String Firstname2=input.nextLine();
						System.out.println("enter lastanme");

						String lastname2=input.nextLine();
						System.out.println("enter age");
						String age2=input.nextLine();
						System.out.println("email");
						String email2=input.nextLine();
						System.out.println("ipaddress ");
						String ipaddress2=input.nextLine();
						System.out.println("country ");
						String country2=input.nextLine();
						System.out.println("order ");
						String order2=input.nextLine();
						System.out.println("color ");
						String color2=input.nextLine();
					
						try 
						{
						insertStringInFile1(infile, lineno, id6,Firstname2,lastname2,age2,email2,country2,ipaddress2,order2,color2);
					    }

						catch (Exception e) 
						{
						   e.printStackTrace();
					    }
						finally{
							input.close();
						}
					}
	}
						public void insertStringInFile(File inFile, String idno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
							       throws Exception {

							 // temp file
						     File outFile = new File("$$$$$$$$.tmp");

						     // input
						     FileInputStream fis  = new FileInputStream(inFile);
						     BufferedReader in = new BufferedReader
						         (new InputStreamReader(fis));

						     // output        
						     FileOutputStream fos = new FileOutputStream(outFile);
						     PrintWriter out = new PrintWriter(fos);

						     String thisLine = "";
						     //int i =1;
						     while ((thisLine = in.readLine()) != null) {
						    	 String strar[] = thisLine.split(",");
						    	 if(idno.equalsIgnoreCase(strar[0])) 

						    	 {
						    		out.print(id);
						    	   out.print(",");
						    	   out.print(firstname);
						    	   out.print(",");
						    	   out.print(lastname);
						    	   out.print(",");
						    	   out.print(age);
						    	   out.print(",");
						    	   out.print(email);
						    	   out.print(",");
						    	   out.print(country);
						    	   out.print(",");
						    	   out.print(ipaddress);
						    	   out.print(",");
						    	   out.print(order);
						    	   out.print(",");
						    	   out.print(color);
						    	   out.println(",");

						    	   }

						       out.println(thisLine);

						       //i++;
						       }
						    out.flush();
						    out.close();
						    in.close();

						    inFile.delete();
						    outFile.renameTo(inFile);
						  }
					public void insertStringInFile1(File inFile, int lineno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
						       throws Exception {

							 // temp file
						     File outFile = new File("$$$$$$$$.tmp");

						     // input
						     FileInputStream fis  = new FileInputStream(inFile);
						     BufferedReader in = new BufferedReader
						         (new InputStreamReader(fis));

						     // output        
						     FileOutputStream fos = new FileOutputStream(outFile);
						     PrintWriter out = new PrintWriter(fos);

						     String thisLine = "";
						     int i =1;
						     while ((thisLine = in.readLine()) != null) {
						       if(i == lineno) 
						    	   {
						    	   out.print(id);
						    	   out.print(",");
						    	   out.print(firstname);
						    	   out.print(",");
						    	   out.print(lastname);
						    	   out.print(",");
						    	   out.print(age);
						    	   out.print(",");
						    	   out.print(email);
						    	   out.print(",");
						    	   out.print(country);
						    	   out.print(",");
						    	   out.print(ipaddress);
						    	   out.print(",");
						    	   out.print(order);
						    	   out.print(",");
						    	   out.print(color);
						    	   out.println(",");

						    	   }

						       out.println(thisLine);
						       i++;
						       }
						    out.flush();
						    out.close();
						    in.close();

						    inFile.delete();
						    outFile.renameTo(inFile);
						  }
					public void insertStringInFile2(File inFile, String idno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
						       throws Exception {

							 // temp file
						     File outFile = new File("$$$$$$$$.tmp");

						     // input
						     FileInputStream fis  = new FileInputStream(inFile);
						     BufferedReader in = new BufferedReader
						         (new InputStreamReader(fis));
						     
							    in.close();

							    inFile.delete();
							    outFile.renameTo(inFile);

      } 
					
	public void fetchRecord()
	{
		
			
		String fName = "D:\\GIT\\SortedCsv.csv";
	    String thisLine;
	    Scanner in = new Scanner(System.in);
        System.out.println("search by id number ");
         String input= in.next();
	   try{
		   BufferedReader br = new BufferedReader(new FileReader(fName));
            while ((thisLine = br.readLine()) != null) {
	        String strar[] = thisLine.split(",");
	            if(input.equalsIgnoreCase(strar[0])){
	                System.out.println(thisLine);
	            }
	                	
	          
	                }
            in.close();
            br.close();
	        }
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void deleteRecord()
	{
		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		File infile=new File("D:\\GIT\\SortedCsv.csv");
		System.out.println("Delete Record by ID");
		id = input.nextLine();
 		//File infile=new File("d:/general/MOCK_DATA.csv");
 		File cFile = new File(infile + "Temp.csv");
 		BufferedReader br;
		try {
			br = new BufferedReader (new FileReader(infile));
		
 		PrintWriter Pwr = new PrintWriter(new FileWriter (cFile));
 		String line = null;

 		//read from original, write to temporary and trim space, while Id not found
 		while((line = br.readLine()) !=null) 
 		{
 			if(line.trim().startsWith(id))
 			{
 				continue;   
 			}
 			else
 			{
 				Pwr.println(line);
 				Pwr.flush();
 			}
 		}
 		// close readers and writers
 		br.close();
 		Pwr.close();
 		input.close();
 		//.close();

 		// delete original file before renaming temp
 		infile.delete();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 		// rename temp file back to original file
 		if(cFile.renameTo(infile))
 		{
        System.out.println("Deleted a record succesfully");
 		}
 		else
 		{
        System.out.println("Deletion failed");
	            }
	                	
	          
	             
	}

}
