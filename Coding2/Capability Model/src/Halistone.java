import java.io.*;
import java.util.Scanner;
public class Halistone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		n=sc.nextInt();
		while(n>1)
		{
		if(n%2==0)
		{
		 n=n/2;
		 System.out.println(n+" ");
		 count++;
		}
		else
		{
			n=(3*n)+1;
			 System.out.println(n+" ");
			 count++;
		}
		}
		System.out.println("count="+count);
	}
}
