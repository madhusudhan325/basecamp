import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int l[]=sortArray(a);
		System.out.println("Sorted elemets using insertion sorted");
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
	}
	public static int[] sortArray(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			int val=a[i];
			int j=i-1;
			while(j>=0 && a[j]>val)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=val;
		}
		return a;
	}

}
