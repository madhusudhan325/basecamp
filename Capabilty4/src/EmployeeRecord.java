import java.util.Scanner;

class Data {
	String name;
	int empid;
	int salary;
	String branch;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Data(String name, int empid, int salary, String branch) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.branch = branch;
	}
}

public class EmployeeRecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, branch;
		System.out.println("enter array size");
		int n = sc.nextInt();
		Data e[] = new Data[n];
		int empid, salary, k = 0;
		boolean t = true;
		while (t) {
			System.out.println(
					"Enter\n 1.Add Employee Details\n 2.Display Empployee details in Sotred order based on branch\n3.Employee Id in ascending order\n4.Display employee salary whose is having greater than 50000\n 5.exit");
			System.out.println("enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter empid");
				empid = sc.nextInt();
				System.out.println("enter salary");
				salary = sc.nextInt();
				System.out.println("enter branch");
				branch = sc.next();
				e[k] = new Data(name, empid, salary, branch);
				System.out.println("employee details added succesfully");
				k++;
				break;
			case 2:
				if (k == 0) {
					System.out.println("no employees");
				} else {
					String arr[] = new String[k];
					String arr1[] = new String[k];
					System.out.println("enter branch");
					String b = sc.next();
					System.out.println("employee details in sorted order");
					for (int i = 0; i < k; i++) {
						arr[i] = e[i].getName();
						arr1[i] = e[i].getBranch();
					}
					String temp = "", temp1 = "";
					for (int i = 0; i < k; i++) {
						temp = "";
						for (int j = i + 1; j < k; j++) {
							if (arr[i].compareTo(arr[j]) > 0) {
								temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								temp1 = arr1[i];
								arr1[i] = arr1[j];
								arr1[j] = temp1;

							}
						}
					}
					for (int i = 0; i < k; i++) {
						if (b.compareTo(arr1[i]) == 0) {
							System.out.println(arr[i]);
						}
					}
				}
				break;
			case 3:
				if (k == 0) {
					System.out.println("no employees");
				} else {
					System.out.println("Employee details in asscending order");
					int arr2[] = new int[k];
					int m = 0;
					for (int i = 0; i < k; i++) {
						arr2[i] = e[i].getEmpid();
					}
					for (int i = 0; i < k; i++) {
						for (int j = i + 1; j < k; j++) {
							if (arr2[i] > arr2[j]) {
								m = arr2[i];
								arr2[i] = arr2[j];
								arr2[j] = m;
							}
						}
					}
					for (int i = 0; i < k; i++) {
						System.out.println(arr2[i]);
					}

				}
				break;
			case 4:
				if (k == 0) {
					System.out.println("no employee deatils");
				} else {
					System.out.println("Employee salary greater than 50000");
					for (int i = 0; i < k; i++) {
						if (e[i].getSalary() >= 50000) {
							System.out.println(e[i].getName() + " : " + e[i].getSalary());
						}
					}
				}
				break;
			case 5:
				System.out.println("exit from program");
				System.exit(0);
			}
		}
	}

}
