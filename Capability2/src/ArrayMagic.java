import java.util.Scanner;
public class ArrayMagic {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row size");
	int a=sc.nextInt();
	System.out.println("Enter column size");
	int b=sc.nextInt();
	int a1[][]=new int[a][b];
	System.out.println("Enter elements into array");
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{
			a1[i][j]=sc.nextInt();
		}
	}
	System.out.println(arrayMagic(a1,a,b));
	//System.out.println(Arrays.toString(arg0));
}
public static boolean arrayMagic(int a1[][],int a,int b)
{
	int b1[]=new int[a];
	int b2[]=new int[b];
	int sum=0,count=0,sum1=0,count1=0;
	int k=0,k1=0;
	for(int i=0;i<a;i++)
	{
		sum=0;
		for(int j=0;j<b;j++)
		{
			sum=sum+a1[i][j];
		}
	    b1[k]=sum;
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
			}
		}
		break;
	}
	for(int j=0;j<b;j++)
	{
		sum1=0;
		for(int i=0;i<a;i++)
		{
			sum1=sum1+a1[j][i];
		}
	    b2[k1]=sum1;
	    k1++;
	}
	for(int i=0;i<a;i++)
	{
		count1=1;
		for(int j=i+1;j<a;j++) 
		{
			if(b2[i]==b2[j])
			{
				count1++;
			}
		}
		break;
	}
	int d=0,d1=0;
	for(int i=0;i<a;i++)
	{
		for(int j=0;j<b;j++)
		{	if(i==j)
		{
			d=d+a1[i][j];
		}
		}
	}
	for(int i=a-1;i>=0;i--)
	{
		//sum1=0;
		for(int j=0;j<b;j++)
		{
			d1=d1+a1[j][i];
			i--;
		}
		break;
	}
	if(count==a && count1==b && d==d1 )
	{
		return true;
	}
	else
	{
		return false;
	}
}

}
