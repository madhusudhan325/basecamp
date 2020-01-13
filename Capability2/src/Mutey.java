import java.util.Scanner;
public class Mutey {
	static void GetMax(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a ,b and c values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		GetMax(a,b,c);

	}

}
