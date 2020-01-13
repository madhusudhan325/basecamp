import java.util.Scanner;

public class Duplicated {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String t=" ";
		int i,j;
		int n=s.length();
		System.out.println("Duplicates are");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s.charAt(i)==s.charAt(j) && !t.contains(s.charAt(j)+""))
				{
					t=t+s.charAt(i);
				}
			}
		}
		System.out.println(t);
	}

}
