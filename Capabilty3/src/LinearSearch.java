import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		boolean t=false;
		int a[]=new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to search");
		int sea=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==sea)
			{
				t=true;
				break;
			}
		}
		if(t==true)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}

}
