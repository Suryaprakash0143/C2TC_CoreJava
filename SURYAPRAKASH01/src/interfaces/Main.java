package interfaces;

public class Main {

	public static void main(String[] args) {
		Student s=new Student(101,"surya",12000,"Java");
		if (s instanceof Registrables )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			


	}

}
