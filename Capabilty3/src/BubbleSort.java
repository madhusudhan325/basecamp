import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements to be sorted");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n-1;j++)
			{ 
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		}
		System.out.println("Sorted elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
