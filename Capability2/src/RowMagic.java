import java.util.Scanner;
public class RowMagic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size");
		int a=sc.nextInt();
		System.out.println("Enter col size");
		int b=sc.nextInt();
		int a1[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println(rowMagic(a1,a,b));
		}
	public static boolean rowMagic(int a1[][],int a,int b)
	{
		int b1[]=new int[a];
		int sum=0,count=0;
		
		int k=0;
		for(int i=0;i<a;i++)
		{
			//sum=0;
			for(int j=0;j<b;j++)
			{
				sum=sum+a1[i][j];
			}
		    b1[k]=sum;
		    sum=0;
		    k++;
		}
		for(int i=0;i<a;i++)
		{
			count=1;
			for(int j=i+1;j<a;j++) 
			{
				if(b1[i]==b1[j])
				{
					count++;
				//System.out.println("Row Magic Array");
				}
			}
			break;
		}
		if(count==a)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
