package abstracts;

public abstract class Main {

	public static void main(String[] args) {
		
		Three r1=new Three();
		
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		One shape;
		
		shape=new Three(10,20);
		
		shape.calArea(); 
		shape.show();
		

	
	}
}

