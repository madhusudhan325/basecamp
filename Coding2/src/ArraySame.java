import java.util.Scanner;
public class ArraySame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter 1st array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter 2nd array elements");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		
	}

}
