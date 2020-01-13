import java.util.Scanner;
public class CapitalLetters {
public static String smallToLarge(String s)
{
	String s1="";
	String s2="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>=65&&s.charAt(i)<=90)
		{
			s1=s1+s.charAt(i);
		}
		else
		{
			s2=s2+s.charAt(i);
		}
	}
	s1=s1+s2;
	return s1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println(smallToLarge(s));
	}

}
