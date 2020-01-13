import java.util.Scanner;
public class Lottrey {
	public static void ticketS(int a ,int b,int c) {
		
		if (a==b && b==c && c==a)
		{
			System.out.println(20);
		}
		if(a!=b && b!=c && c!=a)
		{
			System.out.println(0);

		}
		if(a==b)
		{
			System.out.println(10);
		}
		if(b==c)
		{
			System.out.println(10);

		}
		if( c==a)
		{
			System.out.println(10);			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a b and c values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		ticketS(a,b,c);
	}

}
