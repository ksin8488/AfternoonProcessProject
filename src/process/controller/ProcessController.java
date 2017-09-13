package process.controller;

import java.util.Scanner;
import process.model.PlayDohCircle;		//gets the package and the class from elsewhere so you can use it here
import process.model.PlayDohSnek;

public class ProcessController
{
	public void start()
	{
		System.out.println("This is a practice project.");
		System.out.println("By practicing I develop muscle memory :D ");
		
		PlayDohCircle firstCircle = new PlayDohCircle();		//creates an instance of an object
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);		//prints out the package, class, @, then hastag value
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want??");
		int circleSize = myScanner.nextInt();		//tells it to get the int for circleSize from the next number on the next line (so the user's input)
		
		PlayDohCircle thirdCircle = new PlayDohCircle(circleSize);		//parameters are different
		System.out.println(thirdCircle);
		
		
		System.out.println("What size should we change it to? ");
		int updated = myScanner.nextInt();
		thirdCircle.setSize(updated);
		System.out.print("The cirlce now is.... " );
		System.out.println(thirdCircle);
		
		//Snek info/coding
		PlayDohSnek snekOne = new PlayDohSnek(1);
		PlayDohSnek snekTwo;
		snekTwo = new PlayDohSnek();
		
		System.out.println("Here are the sneks I made! They're not scary. It even has a hat! ");
		System.out.println(snekOne);
		System.out.println(snekTwo);
	}
}
