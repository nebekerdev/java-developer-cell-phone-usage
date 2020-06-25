package cprg;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

// This class controls the action between the user input and the input files

public class Controller 
{
	String currentFilePath;
	public void openFile(String filepath)
	{
		// To-do: try to open a file, fail early if possible
	}
	
	public void closecurrentFile()
	{
		
	}
	
	public void getYear() 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please select a year to run a report for: ");
		
		try 
		{ 
			int year = userInput.nextInt();
		} catch (InputMismatchException invalidInput)
		{
			System.out.println("Invalid data submitted");
			getYear();
			
		}
	}
	public void sumMinutes(int year) 
	{
		// To-do: sum the minutes in the CellphoneUsageByMonth file
	}
	
	public void sumData (int year)
	{
		// To-do: sum the data in the CellphoneUsageByMonth file
	}
	
	public void averageMinutes(int year)
	{
		// To-do: Get the average minutes in the CellphoneUsageByMonth file
	}
	public void averageData(int year)
	{
		// To-do: Get the average data in the CellphoneUsageByMonth file
	}
	
	public void createHeader()
	{
		// To-do: create the header for our resultant file
	}
	
	public void print()
	{
		
	}
	
	public void createDetails()
	{
		//To-do: create details section for our resultant file
	}
}
