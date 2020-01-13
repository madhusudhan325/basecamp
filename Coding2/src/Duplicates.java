import java.util.Scanner;

public class Duplicates {
	public static void printDuplicates(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length-1;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println("Duplicate array is "+s[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		sc.nextLine();
		String s[]=new String[n];
		System.out.println("enter words into array");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.nextLine();
		}
		printDuplicates(s);
		

	}

}
