import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

public class Lab5 {
	
	public static void main(String[] args) {
		FileDialog fd = null;
		fd = new FileDialog(fd, "Pick a File", FileDialog.LOAD);
		fd.setVisible(true);
		String directory = fd.getDirectory();
		String name = fd.getFile();
		String fullName = directory + name;
		
		File dataFile = new File(fullName);
		
		Scanner dataReader = null;
		try {
			dataReader = new Scanner(dataFile);
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("Could not open " + fullName);
			return;
		}
		
		System.out.println("Please enter desired item:");
		Scanner input = new Scanner(System.in);
		String desiredItem = input.next();
		
		int matches = 0;
		double inventoryCount = 0;
		int maximumInventoryCount = 0;
		double averageInventoryCount = 0;
		
	    while(dataReader.hasNext()) {
	    		String city = dataReader.next();
	    		String state = dataReader.next();
			String item = dataReader.next();
			int quantity = dataReader.nextInt();
	
			if(desiredItem.equalsIgnoreCase(item)) {
	    			matches++;
	    			if(quantity > maximumInventoryCount) {
	    				maximumInventoryCount = quantity;
	    			}
	    			inventoryCount = inventoryCount + quantity;
	    			averageInventoryCount = inventoryCount / matches;
	    		}
	    }
		
		System.out.println("There are " + matches + " matches.");
		System.out.println("The maximum inventory count is " + maximumInventoryCount);
		System.out.printf("The average inventory count is  %.2f\n", averageInventoryCount);
		
		input.close();
		dataReader.close();
	}
}
