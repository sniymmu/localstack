import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class readingFromFileExample 
{
	public static void main (String [] args)
	{
		File myfile = new File("data.txt");
		try
		{
			Scanner reader = new Scanner (myfile);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
