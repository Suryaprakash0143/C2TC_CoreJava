package singleinheritance;

public class Super {
	private String name;
	private String aadharNo;
	private String address;
	private long phno;
	
	

	public Super() {
		System.out.println("Citizen object created");
	}

	public Super(String name, String aadharNo, String address, long phno) {

		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Super [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phno=" + phno + "]";
	}
	

}
