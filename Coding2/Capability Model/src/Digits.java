import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int n=sc.nextInt();
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("count : " +count);
	}
}
