/**
 * Prosoner is a class that describes an individual prisoner
 * 
 * @author sblythe
 * @version 4/2018
 */
public class Prisoner {
	private String name;    // prisoner's name
	private String offense; // crime they committed
	private int timeServed; // time spent in prison
	
	/**
	 * constructor for a Prisoner
	 * @param name    the Prisoner's name
	 * @param crime   the Prioner's crime
	 * @param served  time in Prison
	 */
	public Prisoner(String name, String crime, int served)
	{
		// initialize instance variables
		this.name=name;
		offense=crime;
		timeServed=served;
	}
	
	/**
	 * accessor for prisoner name
	 * @return The prisonor's name
	 */
	public String getName() {return name;}
	
	/**
	 * Accessor for prisoner's crime
	 * @return the crime this prisoner committed
	 */
	public String getOffense() {return offense;}
	
	/**
	 * Accessor for time serverd
	 * @return the amount of time prisoner has beenin prison
	 */
	public int getTimeServed() {return timeServed;}
	
	/**
	 * Add this much to a prisoner's time served
	 * @param amountServed
	 */
	public void addTimeServed(int amountServed)
	{
		timeServed+=amountServed;
	}
	
	/**
	 * generate a String version of the prisoner details
	 *   recall that toString is automatically called "on
	 *   demand" when Java needs a String version of the
	 *   associated object ... for example, coding this
	 *   allows programmers using the Prisoner class to
	 *   print a Prisoner inside of a call to print or
	 *   println
	 * @return a string version of the prisoner. 
	 */
	public String toString()
	{
		String s = name + ";" +offense ;
		s+= "(" + timeServed +")";
		return s;
	}
}
