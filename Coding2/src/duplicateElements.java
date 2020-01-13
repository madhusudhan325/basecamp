import java.util.Scanner;
public class duplicateElements {
public static void printUnique(int a[])
{
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
	
		if(count==1)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements into array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();;
		}
		printUnique(a);
	}

}
