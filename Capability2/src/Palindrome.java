import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();
		String t=" ";
		
		for(int i=0;i<len;i++)
		{
			t=t+str.charAt(i);
		}
		System.out.println(t);
		

	}

}
