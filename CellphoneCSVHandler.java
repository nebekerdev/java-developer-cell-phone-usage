package cprg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// This class provides the methods to operate on CSV files representing Cellphone Usage Statistics.


public class CellphoneCSVHandler extends CellPhoneFileHandler
{
	String[] filepaths;
	
	CellphoneCSVHandler(String[] externalFilePaths)
	{
		for (int pathIndex = 0; pathIndex < filepaths.length; ++pathIndex)
		{
			this.filepaths[pathIndex] = externalFilePaths[pathIndex];
		}
		
	}
	public void filterBy(String file, int filter)
	{
		try 
		{
			BufferedReader csvFile = new BufferedReader (new FileReader(file));
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found!");
		}
	}
}
