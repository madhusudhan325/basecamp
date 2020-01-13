import java.util.Scanner;

class Details {
	int custId;
	String custName;
	String custAddrs;
	String accType;
	double bal;

	public int getId() {
		return custId;
	}

	public int setId(int i) {
		return custId = i;
	}

	public String getName() {
		return custName;
	}

	public String setName(String name) {
		return custName = name;
	}

	public String getAddrs() {
		return custAddrs;
	}

	public String setAddrs(String c) {
		return custAddrs = c;
	}

	public String getType() {
		return accType;
	}

	public String setType(String t) {
		return accType = t;
	}

	public double getBal() {
		return bal;
	}

	public double setBal(double b) {
		return bal = b;
	}

	Details(int i, String name, String c, String t, double b) {
		custId = i;
		custName = name;
		custAddrs = c;
		accType = t;
		bal = b;
	}

	Details(int i, String name) {
		custId = i;
		custName = name;
	}

	Details(int i, String name, String c, double b) {
		custId = i;
		custName = name;
		custAddrs = c;
		bal = b;
	}
}

public class YesBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name:");
		String name = sc.nextLine();
		System.out.println("Enter customer address :");
		String c = sc.nextLine();
		System.out.println("Enter customer account type :");
		String t = sc.nextLine();
		System.out.println("Enter customer id:");
		int i = sc.nextInt();
		System.out.println("Enter account balance:");
		double b = sc.nextDouble();
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			Details d = new Details(i, name, c, t, b);
			System.out.println("Customer Id is : " + d.getId());
			System.out.println("Customer Name is : " + d.getName());
			System.out.println("Customer Address is : " + d.getAddrs());
			System.out.println("Customer Account type is : " + d.getType());
			System.out.println("Customer balance in bank is : " + d.getBal());
			break;
		case 2:
			Details d1 = new Details(i, name);
			System.out.println("Customer Id is : " + d1.getId());
			System.out.println("Customer Name is : " + d1.getName());
			System.out.println("Customer Address is : " + d1.getAddrs());
			System.out.println("Customer Account type is : " + d1.getType());
			System.out.println("Customer balance in bank is : " + d1.getBal());
			break;
		case 3:
			Details d2 = new Details(i, name, c, b);
			System.out.println("Customer Id is : " + d2.getId());
			System.out.println("Customer Name is : " + d2.getName());
			System.out.println("Customer Address is : " + d2.getAddrs());
			System.out.println("Customer Account type is : " + d2.getType());
			System.out.println("Customer balance in bank is : " + d2.getBal());
			break;
		}
	}
}
