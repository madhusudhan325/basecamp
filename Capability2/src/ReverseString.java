import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of string");
		int n=sc.nextInt();
		sc.nextLine();
		String s[]=new String[n];
		System.out.println("Enter string words");
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		String rev=" ";
		String em=" ";
		String msr=" ";
		String rt= " ";
		for(int i=0;i<n;i++)
		{
			em=s[i];
			rev=" ";
			msr=" ";
			rt=" ";
			for(int k=0;k<em.length();k++)
			{
			if((em.charAt(k)>=97&&em.charAt(k)<=122)||(em.charAt(k)>=65&&em.charAt(k)<=90))
			{
				msr=msr+em.charAt(k);
			}
			else
			{
				rev=rev+em.charAt(k);
			}
			}
			for(int j=msr.length()-1;j>=0;j--) 
			{
				rev=rev+msr.charAt(j);
			}
			s[i]=rev;
		}
		for(int i1=0;i1<n;i1++)
		{
			System.out.print(s[i1]+" ");
		}
	}

}
