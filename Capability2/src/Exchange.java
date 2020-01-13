import java.util.Scanner;
public class Exchange {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string name");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		System.out.println("Enter 2nd string name");
		String s1=sc.nextLine();
		String b[]=s1.split(" ");
		for(int i=0;i<(a.length-1);i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print(b[b.length-1]+" and ");
		for(int i=0;i<(b.length-1);i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.print(a[a.length-1]+" ");
		sc.close();
		}
}
