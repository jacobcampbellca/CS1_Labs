import java.util.Scanner;

/**
 * 
 * Driver class that contains an elementary test for
 *  the BasicStatistics class
 * 
 * @author Stephen Blythe
 * @version 4/2018
 */
public class Lab6Driver {

	/* 
	 * simple method to print out the mean, variance and standard
	 *    deviation of a provided data set. 
	 *    
	 * @param bs - the data set to work with
	 */
	public static void dumpStats(BasicStatistics bs)
	{
		System.out.printf("     mean = %14.6f\n", bs.mean());
		System.out.printf(" variance = %14.6f\n", bs.variance());
		System.out.printf("std. dev. = %14.6f\n", bs.standardDeviation());
	}
	
	public static void main(String[] args) {
		
		// build a data set {20, 60, 35 15, 50, 35}, as in the lab hand out
		Scanner directData = new Scanner("20 60 35 15 50 35");
		BasicStatistics myData = new BasicStatistics();
		myData.loadData(directData);
		
		// dump out expected and actually calculated values
		System.out.println("Expected values:");
		System.out.println("  mean: 35.833333, variance: 245.138889, std dev: 15.656912");
		System.out.println("Actual values:");
		dumpStats(myData);
		
		System.out.println("=========================================");
		
		// update the data set and print out expected and actual values. 
		Scanner moreData = new Scanner("10 -8 -6 1");
		myData.loadData(moreData);
		System.out.println("Expected values:");
		System.out.println("  mean: 21.2, variance: 488.16, std dev: 22.094343");
		System.out.println("Actual values:");
		dumpStats(myData);
		
		System.out.println("=========================================");
		
		// empty the data set and print out the expected and actual values
		myData.clearData();
		System.out.println("Expected values:");
		System.out.println("  mean: 0, variance: 0, std dev: 0");
		System.out.println("Actual values:");
		dumpStats(myData);
	}

}
