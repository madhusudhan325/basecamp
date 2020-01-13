import java.util.Scanner;
public class SearchElement {

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
		System.out.println("Enter element to search");
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(k==a[i])
			{
				count++;
				if(count==1)
				{
					System.out.println(i);
				}
				else
				{
					System.out.println("Error message");
					System.exit(0);
				}
			}
		}
	}

}
