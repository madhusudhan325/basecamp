import java.util.Scanner;

public class Reverse {
	public static void digitS(int n,int rev,int rem) 
	{	
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println("reversed number is " +rev);
	}
	public static void main(String[] args) {
		int n,rem = 0,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		digitS(n,rev,rem);
		
}
}