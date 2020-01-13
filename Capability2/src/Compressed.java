import java.util.Scanner;
public class Compressed {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String s1=s.toLowerCase();
		int count=0;
		System.out.println("Compressed string is");
		for(int i=0;i<s1.length();i++)
		{
			count=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)!=s1.charAt(j))
				{
					break;
				}
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
				i=j;
			}
			System.out.print(s1.charAt(i)+""+count);
		}
		
	}

}
