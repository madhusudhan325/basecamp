import java.util.Scanner;
public class SeniorJunior {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String s=sc.next();
		printSenior(s);
}
	public static void printSenior(String s) {
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				if(s.charAt(i)!=',')
					s2=s2+s.charAt(i);
			}
		}
		if(s1!="")
		{
			if(Integer.parseInt(s1)>=50)
			{
				s2=s2+" is senior";
			}
			else
			{
				s2=s2+" is junior";
			}
		}
		System.out.println(s2);
	}
}

