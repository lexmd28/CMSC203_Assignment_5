
public class HolidayBonus 
{

	
	
	
	
	public static double[] calculateHolidayBonus(double[][] data)
{
		double high = 0;
		double low = 0;
		double other = 0;
		double[][]dataTwo = new double[data.length][];
	double[] holidayBonusPerStore = new double[data.length];
	
	for(int i = 0; i < data.length; i++)
	{
		dataTwo[i] = new double[data[i].length];
	}
	
	for(int i = 0; i < dataTwo.length; i++)
	{
		for(int j = 0; j < dataTwo.length; j++)
		{
			int higher = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
			int lower = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
			if(i < dataTwo[j].length)
			{
				dataTwo[lower][i] = low;
				dataTwo[higher][i] = high;
				if(j == higher || j == lower)
					continue;
				else
				{
					dataTwo[i][j] = other;
				}
			}
		}
	}
	
	
	for(int i = 0; i < dataTwo.length; i++)
	{
		for(int j = 0; j < dataTwo[i].length; j++)
		{
			holidayBonusPerStore[i] += dataTwo[i][j];
		}
	}
		return holidayBonusPerStore;
	
	
}
	
	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double high = 0;
		double low = 0;
		double other = 0;
		double [][]dataTwo = new double[data.length][];
		for(int i = 0; i < dataTwo.length; i++)
		{
			dataTwo[i] = new double[data[i].length];
		}
		for(int i = 0; i < dataTwo.length; i++)
		{
			for(int j = 0; j < dataTwo[i].length; j++)
			{
				int higher = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
				int lower = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
			if(i < dataTwo[j].length)
			{
				dataTwo[lower][i] = low;
				if(j == higher || j == lower)
				{
					continue;
				}
				else
				{
					dataTwo[i][j] = other;
				}
			}
			
			}
		}
		
		
		
		
		
		
		double total = 0;
		for(int i = 0; i < dataTwo.length; i++)
		{
			for(int j = 0; j < dataTwo[i].length; j++)
			{
				total += dataTwo[i][j];
			}
		}
		return total;
	}
	
}
	
	

