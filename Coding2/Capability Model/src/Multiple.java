import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array size");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd array size");
		int n2=sc.nextInt();
		int i=0;
		double a[]=new double[n1];
		double b[]=new double[n2];
		System.out.println("Enter 1st array elements");
		for(i=0;i<n1;i++)	
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Enter 2nd array elements");
		for(i=0;i<n2;i++)
		{
			b[i]=sc.nextDouble();
		}
		int max=n1>n2?n1:n2;
		int c[]=new int[max];
		System.out.println("resultant array is ");
		for(i=0;i<max;i++)
		{
			if(n1==n2)
			{
				c[i]=(int) (a[i]+b[i]);
				System.out.print(c[i]+" ");
			}
			else if(n1<n2)
			{
				if(i>=n1)
				{
					c[i]=(int) b[i];
					System.out.print(c[i]+" ");
				}
				else
				{
					c[i]=(int) (a[i]+b[i]);
				System.out.print(c[i]+" ");
				}
			}
			else
			{
				if(i>=n2)
				{
					c[i]=(int)a[i];
					System.out.print(c[i]+" ");
				}
				else
				{
					c[i]=(int) (a[i]+b[i]);
					System.out.print(c[i]+" ");
				}
				
			}
			
		}
		sc.close();
	}	
}

