package polymorphism;

public class Main {

	public static void main(String[] args) {
System.out.println("------------------------ Constructor Overloading -----------------------");
		
		Pointer p = new Pointer(); //default constructor invoked
		System.out.println(p);

		Pointer p1 = new Pointer(14.5f); //single parameter constructor
		System.out.println(p1);

		Pointer p2 = new Pointer(12.5f, 20.50f); //two paramters constructor
		System.out.println(p2);

		System.out.println("------------------------  OverLoading -----------------------");
		System.out.println("Addition of two integers : " + OverLoading.addition(10, 20));
		System.out.println("Addition of two floating numbers :" + OverLoading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + OverLoading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + OverLoading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + OverLoading.addition("Hello ", "World"));
	}
	
		

	}


