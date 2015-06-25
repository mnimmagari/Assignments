import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortProgram 
{
	private static String getField(String line)
	{
		//Extracting the value on which we want to sort
        return line.split(",")[3];
    }

	public static void main(String args[]) throws IOException
	{
	String csv="D:/qsortdata.csv";
	BufferedReader br= new BufferedReader(new FileReader(csv));	
	Map<String, List<String>> map = new TreeMap<String, List<String>>();//Maps unique keys to values
    String line = br.readLine();//read header
    try 
    {
    	while ((line = br.readLine()) != null) 
    		{
    			String key = getField(line);
    			//System.out.println(key);
    			List<String> l = map.get(key);//Returns the value associated with the key k.
    				if (l == null)
    					{
    						l = new LinkedList<String>();
    						map.put(key, l);
    					}
    					l.add(line);
    					//System.out.println(map.values());
    		}
    		br.close();
    }
    
    catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    try
    {
    	FileWriter writer = new FileWriter("D:/SortedData2.csv");
    	writer.write("ID, First Name, Last Name, Age, Email, County, IP Address, Order, Color  \n");
    	System.out.println("Sorting Complete.See sorted data in csv file.");
    	for (List<String> list : map.values())
    	{
    		
    		for (String val : list) 
    		{
    			//System.out.println(list);
    			writer.write(val);
    			writer.write("\n");
    		}
    	}
     writer.close();
    }
    catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
}

}
