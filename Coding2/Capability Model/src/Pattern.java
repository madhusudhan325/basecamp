import java.util.Scanner;
public class Pattern {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
		
		System.out.println();
		}
	}

}
