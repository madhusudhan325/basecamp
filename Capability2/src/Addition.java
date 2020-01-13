import  java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array size");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd array size");
		int n2=sc.nextInt();
		int i=0,j=0;
		int a[][]=new int[n1][n2];
		int b[][]=new int[n2][n2];
		int c[][]=new int[n1][n2];
		System.out.println("Enter 1st array elements");
		for(i=0;i<n1;i++)	
		{
			for(j=0;j<n2;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd array elements");
		for(i=0;i<n2;i++)
		{
			for(j=0;j<n2;j++) 
			{
			b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Resultant array");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n2;j++) 
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
