package singleinheritance;

public class Duper extends Super {
	private int rollNo;
	private String collegeName;

	public Duper() {
		super();
	}

	public Duper(String name, String aadharNo, String address, long phno, int rollNo, String collegeName) {
		super(name, aadharNo, address, phno); 
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Duper [rollNo=" + rollNo + ", collegeName=" + collegeName + "]";
	}
     

}
