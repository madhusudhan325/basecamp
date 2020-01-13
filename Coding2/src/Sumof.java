import java.util.Scanner;
public class Sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter sum");
		int sum=sc.nextInt();
		int sum1=0;
		for(int i=0;i<n;i++)
		{
			sum1=0;
			for(int j=i+1;j<n;j++)
			{
				sum1=a[i]+a[j];
				if(sum1==sum)
				{
					System.out.println((a[i]+" "+a[j]));
				}
			}
		}
	}

}
