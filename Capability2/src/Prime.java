import java.util.Scanner;
public class Prime {
	public static boolean IsPrime(long n) {
		long i = 2,count=0,m=0;
		m=n/2;
		if(n==0 ||n==1)
		{
			return false;
		}
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				count++;
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		long n=s.nextInt();
		System.out.println(IsPrime(n));
	}
}
