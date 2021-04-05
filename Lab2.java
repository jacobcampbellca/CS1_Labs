import java.util.Scanner;
import java.awt.Polygon;
import java.awt.Rectangle;

public class Lab2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstX, firstY;
		int secondX, secondY;
		int thirdX, thirdY;
		int fourthX, fourthY;
		int fifthX, fifthY;
		int rectangleX, rectangleY;
		int rectangleWidth, rectangleHeight;
		
		System.out.println("Polygon Values");
		
		System.out.println("Please enter first X value:");
		firstX = input.nextInt();
		System.out.println("Please enter first Y value:");
		firstY = input.nextInt();
		System.out.println("First Point: (" +firstX+ ", " +firstY+ ")");
		System.out.println(" ");
		
		System.out.println("Please enter second X value:");
		secondX = input.nextInt();
		System.out.println("Please enter second Y value:");
		secondY = input.nextInt();
		System.out.println("Second Point: (" +secondX+ ", " +secondY+ ")");
		System.out.println(" ");
		
		System.out.println("Please enter third X value:");
		thirdX = input.nextInt();
		System.out.println("Please enter third Y value:");
		thirdY = input.nextInt();
		System.out.println("Third Point: (" +thirdX+ ", " +thirdY+ ")");
		System.out.println(" ");
	
		System.out.println("Please enter fourth X value:");
		fourthX = input.nextInt();
		System.out.println("Please enter fourth Y value:");
		fourthY = input.nextInt();
		System.out.println("Fourth Point: (" +fourthX+ ", " +fourthY+ ")");
		System.out.println(" ");
		
		System.out.println("Please enter fifth X value:");
		fifthX = input.nextInt();
		System.out.println("Please enter fifth Y value:");
		fifthY = input.nextInt();
		System.out.println("Fifth point: (" +fifthX+ ", " +fifthY+ ")");
		System.out.println(" ");
		
		Polygon polygon = new Polygon();
		polygon.addPoint(firstX, firstY);
		polygon.addPoint(secondX, secondY);
		polygon.addPoint(thirdX, thirdY);
		polygon.addPoint(fourthX, fourthY);
		polygon.addPoint(fifthX, fifthY);		
		
		System.out.println("Rectangle Values");
		
		System.out.println("Please enter X value for top left corner of rectangle:");
		rectangleX = input.nextInt();
		System.out.println("Please enter Y value for top left corner of rectangle:");
		rectangleY = input.nextInt();
		System.out.println("Please enter rectangle Width:");
		rectangleWidth = input.nextInt();
		System.out.println("Please enter rectangle Height:");
		rectangleHeight = input.nextInt();
		System.out.println(" ");
		
		Rectangle rectangle = new Rectangle();
		rectangle.setBounds(rectangleX, rectangleY, rectangleWidth, rectangleHeight);
		
		input.close();
		
		if (polygon.intersects(rectangle)) {
			System.out.print("It is true that the polygon and the rectangle intersect.");
		}
		else {
			System.out.println("It is false that the polygon and the rectangle intersect.");
		}		
	}
}
