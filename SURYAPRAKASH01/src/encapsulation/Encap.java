package encapsulation;

public class Encap {
	int customernum;
	String customername;
	int age;
	public int getCustomernum() {
		return customernum;
	}
	public void setCustomernum(int customernum) {
		this.customernum = customernum;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Encap [customernum=" + customernum + ", customername=" + customername + ", age=" + age + "]";
	}

}
