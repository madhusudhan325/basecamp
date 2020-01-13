import java.util.Scanner;
public class SumDigits {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[2*n];
		System.out.println("enter elements into first array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter elements into second array");
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(b[i]==a[j])
				{
					count++;
				}
			}
			for(int j=0;j<n;j++)
			{
				if(b[i]==b[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.print(b[i]+" ");
			}
		}
		System.out.println();
		int k=0;
		for(int i=0;i<n;i++)
		{
			c[k]=a[i];
			k++;
		}
		int o=n;
		for(int i=0;i<n;i++)
		{
			c[o]=b[i];
			o++;
		}
		int temp=0;
		for(int i=0;i<(2*n)-1;i++)
		{
			if(c[i]>c[i+1])
			{
				temp=c[i];
				c[i]=c[i+1];
				c[i+1]=temp;
			}
		}
		System.out.println("smallest element is "+c[0]);
		System.out.println("largest element is "+c[(2*n)-1]);
	}

}
