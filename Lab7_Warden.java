/**
 * A quick test driver for CSC14400 Lab #7
 * 
 * Be warned that this is a VERY simple test.
 *  
 * @author sblythe
 *
 */
public class Warden {

	public static void main(String[] args) {

		/*
		 The following is the expected output:

*** WARNING *** This test is NOT exhaustive!
It is only a very simple test of the basics!
====unsorted====
Jones;Plagiarism(4)
Smith;Cheating(7)
Clinton;Politics(25)
Trump;Politics(22)
====sorted by name====
Clinton;Politics(25)
Jones;Plagiarism(4)
Smith;Cheating(7)
Trump;Politics(22)
====sorted by time served====
Clinton;Politics(25)
Trump;Politics(22)
Smith;Cheating(7)
Jones;Plagiarism(4)
===after adding one more prisoner====
Clinton;Politics(25)
Trump;Politics(22)
Smith;Cheating(7)
Jones;Plagiarism(4)
Blythe;BeingTooNice(1000)
		  
		 */
		
		
		System.out.println("**** WARNING *** This test is NOT exhaustive!");
		System.out.println("It is only a very simple test of the basics!");
		
		Prison levenworth = new Prison(10);
		
		levenworth.addPrisoner(new Prisoner("Jones", "Plagiarism", 4));
		levenworth.addPrisoner(new Prisoner("Smith", "Cheating", 7));
		levenworth.addPrisoner(new Prisoner("Clinton", "Politics", 25));
		levenworth.addPrisoner(new Prisoner("Trump", "Politics", 22));
	
		System.out.println("====unsorted====");		
		System.out.print(levenworth);
		System.out.println("====sorted by name====");
		levenworth.sortByName();
		System.out.print(levenworth);
		System.out.println("====sorted by time served====");
		levenworth.sortByTimeServed();
		System.out.print(levenworth);
		
		levenworth.addPrisoner(new Prisoner("Blythe", "BeingTooNice", 1000));
		System.out.println("===after adding one more prisoner====");
		System.out.print(levenworth);
	}

}

