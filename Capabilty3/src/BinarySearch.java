import java.util.Scanner;;
public class BinarySearch {
	public static boolean findElement(int a[],int k)
	{
		int temp =0;
		for(int q=0;q<a.length;q++)
		{
			for(int s=q+1;s<a.length;s++)
			{
				if(a[q]<a[s])
				 temp=a[q];
				a[q]=a[s];
				a[s]=temp;
			}
		}
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(k>a[mid])
			{
				j=mid-1;
			}
			else if(k<a[mid])
			{
				i=mid+1;
			}
			else
			{
				if(a[mid]==k)
				{
					return true;
				}
			}
			
		}return false;
	}
	public static boolean findWord(String b[],String name)
	{
		
		String temp="";
		for(int s=0;s<b.length;s++)
		{
			for(int q=s+1;q<b.length;q++)
			{
				temp="";
				if(b[s].compareTo(b[q])>0)
				{
					temp=b[s];
					b[s]=b[q];
					b[q]=temp;
				}
			}
		}
		int i=0;
		int j=b.length,mid=0;
		while(i<=j)
		{
			mid=(i+j)/2;
			if(name.compareTo(b[mid])<0)
			{
				j=mid-1;
			}
			else if(name.compareTo(b[mid])>0)
			{
				i=mid+1;
			}
			else
			{
				if((name.compareTo(b[mid]))==0)
				{
					return true;
				}
			}
			
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		while(t)
		{
			System.out.println(" 1.Binary search for integers\n 2.Binary search for Strings\n 3.Exit");
			System.out.println("Enter your chioce");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter array size");
				int n=sc.nextInt();
				int a[]=new int[n];
				System.out.println("Enter elements");
				for(int i=0;i<n;i++) 
				{
					
					a[i]=sc.nextInt();
				}
				System.out.println("enter element to search");
				int k=sc.nextInt();
				System.out.println(findElement(a,k));
				break;
			case 2:
				System.out.println("Enter String array size");
				int m=sc.nextInt();
				sc.nextLine();
				String b[]=new String[m];
				System.out.println("Enter words into array");
				for(int i=0;i<m;i++)
				{
					b[i]=sc.nextLine();
				}
				System.out.println("Enter word to search");
				String name=sc.nextLine();
				System.out.println(findWord(b,name));
				break;
			case 3:
				System.out.println("Exit from program");
				System.exit(0);
				break;
		}
	}

}
}
