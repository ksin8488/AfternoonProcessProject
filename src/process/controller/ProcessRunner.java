12 package process.controller;

public class ProcessRunner
{
	public static void main( String [] args)
	{
		ProcessController appController =  new ProcessController();		//Deceleration - ProcessController appController	//= - Assignment operation "One Way Street" right to left
		appController.start();
	}
}
