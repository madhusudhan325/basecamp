import java.util.Scanner;
public class Unique {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter 1st array size");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd array size");
		int n2=sc.nextInt();
		int i,j,count=0,k;
		int []a1=new int[n1];
		int a2[]=new int[n2];
		System.out.println("Enter 1st array elements");
		for(i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array elements");
		for(i=0;i<n2;i++)
		{
			a2[i]=sc.nextInt();
		}
		for(i=0;i<n1;i++)
		{
			count=0;
			for(j=0;j<n2;j++)
			{
				if(a1[i]==a2[j])
				{
					count++;
				}
			}
			for(k=i+1;k<n1;k++)
			{
				if(a1[i]==a1[k])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(a1[i]+" ");
			}
		}
		for(i=0;i<n2;i++)
		{
			count=0;
			for(j=i+1;j<n2;j++)
			{
				if(a2[i]==a2[j])
				{
					count++;
				}
			}
			for(k=0;k<n1;k++)
			{
				if(a2[i]==a1[k])
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(a2[i]+" ");
			}
		}

	}

}
