import java.util.Scanner;
public class IndexSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
System.out.println("Enter indexes ");
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int max=0;
		int k=searchin(a,max,n1,n2);
		System.out.println("Max element is "+k);
	}
	
public static int searchin(int a[],int max,int n1,int n2)
	{
		if(n1>=0 && n1<=n2 && n2>=n1 && n2<a.length)
		{
		for(int i=n1;i<=n2;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		}
		else
		{
			System.out.println("Error");
			System.exit(0);
		}
		return max;
	}

}
