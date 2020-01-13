import java.io.*;

import java.util.Scanner;
public class Employee {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int eid=sc.nextInt();
		System.out.println("Enter Jobband:");
		String jb=sc.next();
		System.out.println("Enter Deparment Code:");
		int dc = sc.nextInt();
		detail(eid,jb,dc);
	}
		public static void detail(int eid,String jb,int dc) {
			
		
		if(jb.equalsIgnoreCase("C1")|| jb.equalsIgnoreCase("c2") || jb.equalsIgnoreCase("c3") || jb.equals("c4"))
		{
			
			if(dc>=110  && dc<=125)
			{
				System.out.println(eid+" "+dc+" "+jb);
				//System.out.println(eid);
			}
		}
		else 
		{
			System.out.println("enter valid details");
		}
		
		}
	}
	
	