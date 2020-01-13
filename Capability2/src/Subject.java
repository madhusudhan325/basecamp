import java.util.Scanner;
public class Subject {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int count=0;
		System.out.println("Enter marks");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<26;i++)
		{
			count=0;
			for(int j=0;j<10;j++)
			{
				if(a[j]==i)
				{
					count++;
				}
			}
			
			System.out.println("Student with marks "+i+" is "+count);
		}
		
	}

}
