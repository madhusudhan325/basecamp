import java.util.Scanner;

class Employer {
	String empid;
	String empname;
	String empdept;
	String empdesg;

	public String getId() {
		return empid;
	}

	public String setId(String id) {
		return empid = id;
	}

	public String getName() {
		return empname;
	}

	public String setName(String id1) {
		return empname = id1;
	}

	public String getDept() {
		return empdept;
	}

	public String setDept(String id2) {
		return empdept = id2;
	}

	public String getDesg() {
		return empdesg;
	}

	public String setDesg(String id3) {
		return empdesg = id3;
	}

	Employer(String id, String id1, String id2, String id3) {
		empid = id;
		empname = id1;
		empdept = id2;
		empdesg = id3;
	}
}

public class Employee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		String id = sc.next();
		System.out.println("Enter employee name");
		String id1 = sc.next();
		System.out.println("Enter employee dept");
		String id2 = sc.next();
		System.out.println("Enter employee desg");
		String id3 = sc.next();
		sc.close();
		Employer e = new Employer(id, id1, id2, id3);
		e.setId(id);
		e.setName(id1);
		e.setDept(id2);
		e.setDesg(id3);
		System.out.println("Employee id :" + e.getId());
		if (id1 == null) {
			System.out.println("Error");
		} else {
			System.out.println("Employee id is   : " + e.getName());
		}
		if (id2.compareTo("developer") == 0 || id2.compareTo("tester") == 0 || id2.compareTo("lead") == 0
				|| id2.compareTo("manager") == 0) {
			System.out.println("Employee name is : " + e.getDept());
		} else {
			System.out.println("Invalid Designation");
		}
		if (id3.compareTo("TTH") == 0 || id3.compareTo("DevOps") == 0 || id3.compareTo("RCM") == 0
				|| id2.compareTo("digital") == 0) {
			System.out.println("Employee dept is : " + e.getDesg());
		} else {
			System.out.println("Invalid Department");
		}
	}

}
