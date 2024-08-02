package multipleinheritance;
import java.util.Date;


public class Member extends Person{
	
		private String deptName;
		private double baseSalary;

		public Member(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
			super(name, contactNo, dateOfBirth);
			this.deptName = deptName;
			this.baseSalary = baseSalary;
		}


}
