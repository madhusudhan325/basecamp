import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String t=" ";
		int i,j,count=0;
		int n=s.length();
		System.out.println("Duplicates are");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					t=t+s.charAt(i);
				}
			}
		}
		/*if(t.charAt(i)==t.charAt(j))
		{
			count++;
		}*/
		
			System.out.println(t);
	}

}
