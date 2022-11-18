import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.lang.*;

public class TwoDimRaggedArrayUtility 
{
public static double getAverage(double[][] data)
{
	double sum = 0;
	double elements = 0;
	for(int i = 0; i < data.length; i++)
	{
		for(int j = 0; j < data[i].length; j++)
		{
			sum += data[i][j];
			elements += 1;
			
		}
		
	}
	double average = sum/elements;
	return average;
}

public static double getColumnTotal(double[][] data, int col)
{
	double total = 0;
	for(int i = 0; i < data.length; i++)
	{
		if(col < data[i].length - 1)
		{
			total += data[i][col];
		}
	}
	return total;
}


public static double getHighestInArray(double[][] data)
{
	double high = data[0][0];
	for(int i = 0; i < data.length; i++)
	{
		for(int j = 0; j < data[i].length; j++)
		{
			if(high < data[i][j])
			{
				high = data[i][j];
			}
		}
	}
	return high;
}


public static double getHighestInColumn(double[][] data, int col)
{
	double high = data[0][col];
	for(int i = 0; i < data.length; i++)
	{
		if(col<data[i].length)
		{
			if(data[i][col] > high)
			{
				high = data[i][col];
			}
		}
	}
	return high;
}

public static int getHighestInColumnIndex(double[][] data, int col)
{
	int high = 0;
	for(int i = 0; i < data.length; i++)
	{
		if(data[i].length > col)
		{
			if(data[i][col] > data[high][col])
			{
				high = i;
			}
		}
	}
	return high;
}

public static double getHighestInRow(double[][] data, int row)
{
	double high = 0;
	for(int i = 0; i < data[row].length; i++)
	{
		if(data[row][i] > high)
		{
			high = data[row][i];
		}
	}
	return high;
}

public static int getHighestInRowIndex(double[][] data, int row)
{
	int high = 0;
	for(int i = 0; i < data[row].length; i++)
	{
		if(data[row][i] > data[row][high])
		{
			high = i;
		}
	}
	return high;
}


public static double getLowestInArray(double[][] data)
{
	double low = 0;
	for(int i = 0; i < data.length; i++)
	{
		for(int j = 0; j < data[i].length; j++)
		{
			if(low < data[i][j])
			{
				low = data[i][j];
			}
		}
	}
	return low;
}

public static double getLowestInColumn(double[][] data, int col)
{
	double low = 0;
	for(int i = 0; i < data.length; i ++)
	{
		if(col < data[i].length - 1)
		{
			if(data[i][col] < low)
			{
				low = data[i][col];
			}
		}
	}
	return low;
}

public static int getLowestInColumnIndex(double[][] data, int col)
{
	int low = 0;
	for(int i = 0; i < data.length; i ++)
	{
		if(col < data[i].length)
		{
			if(data[i][col] < data[low][col])
			{
				low = i;
			}
		}
	}
	return low;
}

public static double getLowestInRow(double [][] data, int row)
{
	double low = 0;
	for(int i = 0; i < data[row].length; i++)
	{
		if(data[row][i] < low)
		{
			low = data[row][i];
		}
	}
	return low;
}


public static int getLowestInRowIndex(double [][] data, int row)
{
	int low = 0;
	for(int i = 0; i < data[row].length; i++)
	{
		if(data[row][i] < data[row][low]);
		{
			low = i;
		}
	}
	return low;
}


public static double getRowTotal(double[][] data, int row)
{
	double total = 0;
	for(int i = 0; i < data[row].length; i++)
	{
		total += data[row][i];
	}
	return total;
}


public static double getTotal(double[][] data)
{
	double total = 0;
	for(int i = 0; i < data.length; i++)
	{
		for(int j = 0; j < data[i].length; j++)
		{
			total += data[i][j];
		}
	}
	return total;
}

public static double[][] readFile(File file)
{
	double[][] data = new double[6][6];
	String line;
	int i = 0;
	try
	{
		BufferedReader b = new BufferedReader(new FileReader(file));
		
		while((line = b.readLine()) != null)
{
	String[] temp = line.split(" ");
	int size = temp.length;
	data[i] = new double[size];
	for(int j = 0; i < size; j++)
	{
		data[i][j] = Double.parseDouble(temp[i]);
	}
	i++;
	
}
b.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return data;
}




public static void writeToFile(double[][] data, File outputFile)
{
	try
	{
		BufferedWriter b = new BufferedWriter(new FileWriter(outputFile));
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				b.write(data[i][j] + " ");
			}
			b.newLine();
		}
		b.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	
	
}

























}
