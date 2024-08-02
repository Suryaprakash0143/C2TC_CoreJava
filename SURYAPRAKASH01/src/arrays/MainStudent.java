package arrays;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(1, "Surya");
		
		arr[1] = new Student(2, "Vasu");
		
		arr[2] = new Student(3, "Nathini");
		arr[3] = new Student(4, "Losli");
		arr[4] = new Student(5, "Subash");
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}

}
