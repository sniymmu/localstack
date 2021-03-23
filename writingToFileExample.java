import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writingToFileExample {
	public static void main (String [] args)
	{
		File myfile = new File("data.txt");
		try 
		{
		FileWriter writer = new FileWriter(myfile);
		
		writer.write("Hello, this is your friend Saurav Shakya. \nThank you");
		
		writer.close();
		}
		
		catch (IOException e) 
		{
			e.printStackTrace();
			
		}
	}
}
