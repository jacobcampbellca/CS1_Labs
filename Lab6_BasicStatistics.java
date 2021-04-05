import java.util.Scanner;

public class BasicStatistics {
	
	private double[] dataSet;
	private int currentSize;
	
	public BasicStatistics() {
		dataSet = new double[1000];
		currentSize = 0;
	}
	
	public BasicStatistics(int maximumNumberOfElements) {
		dataSet = new double[maximumNumberOfElements];
		currentSize = 0;
	}
	
	public void loadData(Scanner readFrom) {
		boolean full = false;
		
		while(readFrom.hasNext() && !full) {
			if(currentSize < dataSet.length) {
				dataSet[currentSize++] = readFrom.nextDouble();
			}
			else {
				full = true;
			}
		}
	}
	
	public void clearData() {
		dataSet = new double[1000];
	}
	
	public double mean() {
		double sum = 0;
		int counter = 0;
		for(int i = 0; i < currentSize; i++) {
			sum += dataSet[i];
		}
		return sum / currentSize;
	}
	
	public double variance() {
		double mean = mean();
		double sum = 0;
		int counter = 0;
		for(int i = 0; i < currentSize; i++) {
			double squareDifference = Math.pow(dataSet[i] - mean,2) ;
			sum += squareDifference;
		}
		return sum / currentSize;
	}
	
	public double standardDeviation() {
		double variance = variance();
		double standardDeviation = Math.sqrt(variance);
		return standardDeviation;
	}
}
