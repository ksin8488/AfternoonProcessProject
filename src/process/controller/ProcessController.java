package process.controller;

import process.model.PlayDohCircle;		//gets the package and the class from elsewhere so you can use it here

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
	}
}
