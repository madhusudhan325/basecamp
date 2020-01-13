import java.io.*;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
		System.out.println("multiplication table is");
		for(int i=1;i<=12;++i)
		{
			System.out.printf("%d * %d = %d \n",n, i,n*i);
		}
		sc.close();
	}

}
