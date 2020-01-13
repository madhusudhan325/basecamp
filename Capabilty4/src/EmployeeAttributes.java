import java.util.Scanner;

public class EmployeeAttributes {
	public int empId;

	public int getId() {
		return empId;
	}

	public int setId(int empId1) {
		return empId = empId1;
	}

	public String empName;

	public String getName() {
		return empName;
	}

	public String setName(String empName1) {
		return empName = empName1;
	}

	public String empDesg;

	public String getDesg() {
		return empDesg;
	}

	public String setDesg(String empDesg1) {
		return empDesg = empDesg1;
	}

	public String empDept;

	public String getDept() {
		return empDept;
	}

	public String setDept(String empDept1) {
		return empDept = empDept1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeAttributes ob = new EmployeeAttributes();
		System.out.println("Enter empid");
		int n = sc.nextInt();
		ob.setId(n);
		System.out.println("Enter empName");
		String s = sc.next();
		ob.setName(s);
		System.out.println("Enter empDesg");
		String s1 = sc.next();
		ob.setDesg(s1);
		System.out.println("Enter empDept");
		String s2 = sc.next();
		ob.setDept(s2);
		System.out.println("EmpId is   : " + ob.getId());
		System.out.println("EmpName is : " + ob.getName());
		System.out.println("EmpDept is : " + ob.getDept());
		System.out.println("EmpDesg is : " + ob.getDesg());
		sc.close();
	}
}
