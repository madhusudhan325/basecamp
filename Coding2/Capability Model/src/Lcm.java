import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int l=0,g=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		a=sc.nextInt();
		System.out.println("Enter b values");
		b=sc.nextInt();
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0)
			{
				g=i;
			}
		}
			l=(a*b)/g;
			System.out.println("LCM: "+l);
			System.out.println("GCD: "+g);
}
}
