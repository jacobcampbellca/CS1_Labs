
public class Car {
	
	private String model;
	private String color;
	private int year;
	private int milesDriven;
	private int gallons;
	private double fuelCost;
	
	private int additionalGallons;
	private int additionalMilesDriven;
	private double costOfAdditionalFuel;
	
	private int totalMilesDriven;
	private int totalGallons;
	private double MPG;
	
	
	public Car(String  modelName, String carColor, int carYear) {
		model = modelName;
		color = carColor;
		year = carYear;
	}
	
	public Car(String modelName, String carColor, int carYear, int miles, int gallonsUsed, double cost) {
		model =  modelName;
		color = carColor;
		year = carYear;
		milesDriven = miles;
		gallons = gallonsUsed;
		fuelCost = cost;		
		totalMilesDriven = milesDriven + additionalMilesDriven;
		totalGallons = gallons + additionalGallons;
		MPG = (totalMilesDriven)/(totalGallons);
	}
	
	public int getMiles() {
		 return milesDriven;
	}
	
	public int getGallons() {
		return gallons;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getYear() {
		return year;
	}
	
	public double getFuelCost() {
		return fuelCost;
	}
	
	public void fillup(int gallonsAdded, int additionalMiles, double additionalCost) {
	additionalGallons = gallonsAdded;
	additionalMilesDriven = additionalMiles;
	costOfAdditionalFuel = additionalCost;
	totalMilesDriven = milesDriven + additionalMilesDriven;
	totalGallons = gallons + additionalGallons;
	MPG = (totalMilesDriven)/(totalGallons);
	}
	
	public int totalMiles() {
		return totalMilesDriven;
	}
	
	public int totalGallons() {
		return totalGallons;	
	}
	
	public double getMPG() {
		return MPG;
	}
	
	public String toString() { 
		return year+ " " +color+ " " +model+ " " +totalMilesDriven+ " miles\nMPG of " +model+ " is " +MPG;
	}
}
