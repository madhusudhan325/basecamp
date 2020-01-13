import java.util.Scanner;
public class SortSerach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		while(t)
		{
			System.out.println(" 1.Sort using bubble sort\n 2.Sort using insertion sort\n 3.Binary search for Strings\n 4.Exit");
			System.out.println("Enter your chioce");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter array size");
				int n=sc.nextInt();
				sc.nextLine();
				String a[]=new String[n];
				System.out.println("Enter words");
				for(int i=0;i<n;i++) 
				{
					
					a[i]=sc.nextLine();
				}
				String l[]=sortArray(a);
				System.out.println("Sorted using bubble sort");
				for(int i=0;i<l.length;i++)
				{
					System.out.println(l[i]);
				}
				break;
			case 2:
				System.out.println("enter array size");
				int o=sc.nextInt();
				sc.nextLine();
				String b[]=new String[o];
				System.out.println("Enter words ");
				for(int i=0;i<o;i++) 
				{
					
					b[i]=sc.nextLine();
				}
				String h[]=sortArray1(b);
				System.out.println("sorted using insertion sort");
				for(int i=0;i<h.length;i++)
				{
					System.out.println(h[i]);
				}
				break;
				
			case 3:
				System.out.println("Enter String array size");
				int m=sc.nextInt();
				sc.nextLine();
				String c[]=new String[m];
				System.out.println("Enter words into array");
				for(int i=0;i<m;i++)
				{
					c[i]=sc.nextLine();
				}
				System.out.println("Enter word to search");
				String name=sc.nextLine();
				System.out.println(findWord(c,name));
				break;
			case 4:
				System.out.println("Exit from program");
				System.exit(0);
				break;
		}
	}

}
	public static String[] sortArray(String a[])
	{
		String temp="";
		for(int i=0;i<a.length;i++) 
		{
			temp=" ";
			for(int j=0;j<a.length-1;j++)
			{ 
			if(a[j].compareTo(a[j+1])>0)
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		}
		return a;
	}
	public static String[] sortArray1(String b[])
	{
		for(int i=1;i<b.length;i++)
		{
			String val=b[i];
			int j=i-1;
			while(j>=0 && b[j].compareTo(val)>0)
			{
				b[j+1]=b[j];
				j=j-1;
			}
			b[j+1]=val;
		}
		return b;
	}
	public static boolean findWord(String c[],String name)
	{
		
		String temp="";
		for(int s=0;s<c.length;s++)
		{
			for(int q=s+1;q<c.length;q++)
			{
				temp="";
				if(c[s].compareTo(c[q])>0)
				{
					temp=c[s];
					c[s]=c[q];
					c[q]=temp;
				}
			}
		}
		int i=0;
		int j=c.length,mid=0;
		while(i<=j)
		{
			mid=(i+j)/2;
			if(name.compareTo(c[mid])<0)
			{
				j=mid-1;
			}
			else if(name.compareTo(c[mid])>0)
			{
				i=mid+1;
			}
			else
			{
				if((name.compareTo(c[mid]))==0)
				{
					return true;
				}
			}
			
		}
		return false;
	}
	
}
