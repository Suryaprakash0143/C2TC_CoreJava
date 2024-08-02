package multipleinheritance;
import java.util.Date;

public class OtherMember extends Member {
	private int noOfShares;
    private String authority;
    
    public OtherMember(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
    	super(name,contactNo,dateOfBirth,deptName, baseSalary);
        this.noOfShares = noOfShares;
        this.authority=authority;

}
}
