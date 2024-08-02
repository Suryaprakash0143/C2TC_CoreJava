package polymorphism;

public class SROverRiding {

	public static void main(String[] args) {
		RBIRiding rbi;

		rbi = new SBIRiding();
		System.out.println(rbi.getRateOfInterest());

		rbi = new SICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new SHDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}
