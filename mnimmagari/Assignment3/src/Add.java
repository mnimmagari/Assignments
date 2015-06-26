import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

import com.csvreader.CsvWriter;

public class Add {
	public static void main( String[] args )
	{	
		Scanner input = new Scanner(System.in);
		//String data = input.nextLine();
		
		String id, first_name, last_name,Age, email, country, ip_address, order, color;
		String csv = "D:\\GIT\\SortedCsv.csv";
		boolean existsStatus = new File(csv).exists();
		
		try
		{
		CsvWriter csvWriter = new CsvWriter
				(new FileWriter(csv, true), ',');
		
		if(!existsStatus)
		{
			csvWriter.write("id");
			csvWriter.write("first_name");
			csvWriter.write("last_name");
			csvWriter.write("Age");
			csvWriter.write("email");
			csvWriter.write("country");
			csvWriter.write("ip_address");
			csvWriter.write("order");
			csvWriter.write("Color");
			csvWriter.endRecord();		
		}
		
		System.out.println("enter the details of the customer to add at the last row of CSV");
		
		
			System.out.println("enter id"  );
			id = input.nextLine();
			csvWriter.write(id);
			
			System.out.println("enter first_name"  );
			first_name=input.nextLine();
			csvWriter.write(first_name);
			
			System.out.println("enter last_name"  );
			last_name = input.nextLine();
			csvWriter.write(last_name);
			
			System.out.println("enter age"  );
			Age = input.nextLine();
			csvWriter.write(Age);
			
			System.out.println("enter email"  );
			email = input.nextLine();csvWriter.write(id);
			csvWriter.write(email);
			
			System.out.println("enter country"  );
			country = input.nextLine();
			csvWriter.write(country);
			
			System.out.println("enter ip_address"  );
			ip_address = input.nextLine();
			csvWriter.write(ip_address);
			
			System.out.println("enter order"  );
			order = input.nextLine();
			csvWriter.write(order);
			
			System.out.println("enter Color"  );
			color = input.nextLine();
			csvWriter.write(color);
			csvWriter.endRecord();

			csvWriter.close();
		}

		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			input.close();
			
		}
	}
}
