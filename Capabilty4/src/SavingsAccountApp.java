import java.util.Scanner;

class Savings {
	double bal;
	int interestRate;
	int accountNo;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	Savings() {

	}

	Savings(double b, int ir, int an) {

	}

	public static void withDraw(double wd, double b) {
		if (wd > b) {
			System.out.println("Error");
		} else {
			System.out.println("withdrawm successfully " + wd);
		}
	}

	public static void calInterest(double b, int y, int ir) {
		double si = 0;
		si = ((b * y * ir) / 100);
		System.out.println("simple interest is : " + si);
	}
}

public class SavingsAccountApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter balance in your account ");
		double b = sc.nextDouble();
		System.out.println("enter rate of interest");
		int ir = sc.nextInt();
		System.out.println("Enter account number");
		int an = sc.nextInt();
		System.out.println("enter money to withdraw");
		double wd = sc.nextDouble();
		System.out.println("Enter no.of years ");
		int y = sc.nextInt();
		Savings ss = new Savings();
		Savings s1 = new Savings(b, ir, an);
		s1.withDraw(wd, b);
		s1.calInterest(b, y, ir);
	}
}
