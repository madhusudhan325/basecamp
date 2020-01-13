import java.util.Scanner;
public class MergeSort {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("enter row size");
		int m=sc.nextInt();
		System.out.println("Enter column size");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter elelments into array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[]=new int[m*n];
		int k=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[k]=a[i][j];
				k++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
			if(b[i]>b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
			}
		}
		System.out.println("Sotred array is");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
