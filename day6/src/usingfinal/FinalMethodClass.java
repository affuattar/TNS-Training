package usingfinal;

public class FinalMethodClass {

	
	//constructor
	public FinalMethodClass() {

	System.out.println("This is a default constructor ");
	
	
	}
	
	final int a=50;
	
	void display()
	{
		System.out.println("Hello");
	}
	
	//finall mthod 
	final void show  ()
	{
		System.out.println("Value of a : "+ a);
	}
}