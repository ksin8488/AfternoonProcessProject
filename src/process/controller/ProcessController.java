package process.controller;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import process.model.PlayDohCircle;		//gets the package and the class from elsewhere so you can use it here
import process.model.PlayDohSnek;

/**
 * 
 * @author ksin8488
 *
 */

public class ProcessController
{
	private String [] hats = {"One", "Two", "Three"};		//can initialize in the decleration
	private int [] numbers;
	
	public ProcessController()
	{
		hats = new String[5];
		numbers = new int [10];
	}
	
	public void start()
	{
		//ARRAY PRACTICE 10/25/17
		System.out.println(hats);
		System.out.println(numbers);
		
		hats[0] = "Benie";
		hats[1] = "Fedora";
		hats[2] = "Beret";
		hats[4] = "Cap";		//order of how you put them doesn't matter
		hats[3] = "Balaclava";
		
		System.out.println(hats[0]);
		System.out.println(hats[1]);
		System.out.println(hats[3]);
		
		for (String current : hats)
		{
			System.out.println(current);
		}
		
		for(int index = 0; index < numbers.length; index += 1)		//the last index is 9 so you can't do index <= numbers.length; You also can't to negatives
		{
			numbers[index] = index +1;
			
			System.out.println(numbers[index]);
		}
		
		hats = new String [] {"one", "two", "three", "four", "five"};		//can re-initialize arrays. Only works with arrays
		
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
		
		//ARRAY PRACTICE
		
	}
}
