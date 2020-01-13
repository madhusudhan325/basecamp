import java.io.*;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b value");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("Invalid");
			System.exit(0);
			
		}
		else if(a<=0 || b<=0)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		else
		{
		for(int i=1;i<=10;i++)
		{
			a=a+b;
			b=b+10;
		}
		System.out.println("value of a : "+a);
		System.out.println("value of b : "+b);
		}
	}

}
