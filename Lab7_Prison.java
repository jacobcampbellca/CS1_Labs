import java.util.Scanner;

public class Prison {
	
	private Prisoner[] actualArray;
	Prisoner siriusB;
	private int currentSize;
	
	public Prison (int maxNum)
	{
		actualArray = new Prisoner[maxNum];
		currentSize = 0;
		
	}
	
	public void addPrisoner (Prisoner badBoy)
	{
		actualArray[currentSize++] = badBoy;
	}
	
	public void addPrisoners (Scanner kbd)
	{
		while (kbd.hasNextLine())
		{   
			String nameX = kbd.next();
			String crimeX = kbd.next();
			int timeServedX = kbd.nextInt(); 
			
			siriusB = new Prisoner (nameX, crimeX, timeServedX);
			addPrisoner(siriusB);
			
			
		}
	}
		
	public Prisoner getInformation(String badBoyName)
	{
		String searchedValue = badBoyName;
		int pos = 0;
		boolean found = false;
		while (pos < actualArray.length && !found)
		{   
			if (( actualArray[pos].getName()).equals(searchedValue)) {     
				found = true;   
			}
			else {   
				pos++;
			}
		}
		if (found) {   
			return actualArray[pos];
		}
		else {   
			return null;
		}
	}
	
	public void sortByName()
	{
		 boolean swapDone;
	        
	        do
	        {
	            swapDone=false;
	            
	            for(int index=0; index< currentSize-1; index++)
	            {
	                String so = actualArray[index].getName();
	                String vo = actualArray[index+1].getName();
	                
	                if (so.compareTo( vo )>0)
	                {
	                    Prisoner temp = actualArray[index];
	                    actualArray[index] = actualArray[index+1];
	                    actualArray[index+1] = temp;
	                    swapDone = true;
	                }
	            }
	        }
	        while(swapDone);
	}
	
	public void sortByTimeServed()
	{
		 boolean swapDone;
	        
	        do
	        {
	            swapDone=false;
	            
	            for(int index=0; index< currentSize-1; index++)
	            {
	                if (actualArray[index].getTimeServed() < actualArray[index+1].getTimeServed() )
	                {
	                    Prisoner temp = actualArray[index];
	                    actualArray[index] = actualArray[index+1];
	                    actualArray[index+1] = temp;
	                    swapDone = true;
	                }
	            }
	        }
	        while(swapDone);
	}

	
	public String toString()
	{
		String s = "";
		for(int x = 0; x<currentSize; x++)
		{
			s+= actualArray[x].toString()+"\n";	
		}
		
		return s;
	}
}
