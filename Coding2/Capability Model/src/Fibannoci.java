import java.util.Scanner;
public class Fibannoci {
	public static void evenSum(int n) {
		int a=1,b=1,c=0,sum=0;
		System.out.println(a+" ");
		System.out.println(" "+b);
		while(c<n)
		{
			c=a+b;
			System.out.println(" "+c);
			
			if(c%2==0)
			{
				sum=sum+c;
			}
			a=b;
			b=c;
		}
		System.out.println("even sum is "+sum);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		evenSum(n);
	}
}
