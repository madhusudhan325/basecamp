import java.util.Scanner;

public class CountOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				if(s.charAt(i)==s.charAt(j) && t.contains(s.charAt(j)+""))
				{
					t=t+s.charAt(i);
				}
				
			}
		}
	}
}


