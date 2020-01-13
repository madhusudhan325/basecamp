import java.util.Scanner;
public class Leader {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,j;
		System.out.println("Enter elemnts into array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
			if(a[i]<=a[j])
			{
				break;
			}
			}
			if(j==n)
				System.out.print(a[i]+" ");
		}
}
}
