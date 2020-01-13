import java.util.Scanner;
public class Initials {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		int len=str.length();
		System.out.println("enter age");
		int age=s.nextInt();
		for(int i=0;i<len;i++)
		{
			if(i==0)
			{
				System.out.print(str.charAt(0));
			}
			if(str.charAt(i)==' ')
			{
				System.out.print( str.charAt(i+1));
			}
		}
		System.out.print(age);
	}
}
