

import java.util.Scanner;

public class DuplicateStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String t=" ";
		char a[]=s.toCharArray();
		int i,j,count=0;
		int n=s.length();
		System.out.println("Duplicates are");
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j]&&a[i]!='8')
				{
					count++;
					a[j]='8';
				}
			}
			if(count>=1)
			{
				t=t+a[i];
			}
		}
		System.out.println(t);
	}

}

