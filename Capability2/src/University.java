import java.util.Scanner;
public class University {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		int len=str.length();
		int count=0,i=0;
		if(len==10)
		{
			if(i==0)
			{
				if(str.charAt(i)=='1'||str.charAt(i)=='2')
				{
					count++;
				}
			}
			i++;
			if(i==1) {
				if(str.charAt(i)=='A'|| str.charAt(i)=='B' || str.charAt(i)=='C'|| str.charAt(i)=='D'||str.charAt(i)=='E' ||str.charAt(i)=='F'|| str.charAt(i)=='G'|| str.charAt(i)=='H'|| str.charAt(i)=='I'|| str.charAt(i)=='J'|| str.charAt(i)=='K' || str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O'|| str.charAt(i)=='P'|| str.charAt(i)=='Q'|| str.charAt(i)=='R'|| str.charAt(i)=='S'|| str.charAt(i)=='T'|| str.charAt(i)=='U'|| str.charAt(i)=='V'|| str.charAt(i)=='W'|| str.charAt(i)=='X'|| str.charAt(i)=='Y'|| str.charAt(i)=='Z')
				{
					count++;
				}
			}
			i++;
			if(i==2) {
				if(str.charAt(i)=='A'|| str.charAt(i)=='B' || str.charAt(i)=='C'|| str.charAt(i)=='D'||str.charAt(i)=='E' ||str.charAt(i)=='F'|| str.charAt(i)=='G'|| str.charAt(i)=='H'|| str.charAt(i)=='I'|| str.charAt(i)=='J'|| str.charAt(i)=='K' || str.charAt(i)=='M'||str.charAt(i)=='N'||str.charAt(i)=='O'|| str.charAt(i)=='P'|| str.charAt(i)=='Q'|| str.charAt(i)=='R'|| str.charAt(i)=='S'|| str.charAt(i)=='T'|| str.charAt(i)=='U'|| str.charAt(i)=='V'|| str.charAt(i)=='W'|| str.charAt(i)=='X'|| str.charAt(i)=='Y'|| str.charAt(i)=='Z')
				{
					count++;
				}
			}
			i++;
			if(i==3) {
				if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='0'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				{
					count++;
				}
			}
			i++;
			if(i==4) {
				if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='0'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				{
					count++;
				}
			}
				i++;
				if(i==5) {
				if((str.charAt(i)=='C'&&str.charAt(i+1)=='S')||(str.charAt(i)=='I'&&str.charAt(i+1)=='S')||(str.charAt(i)=='E'&&str.charAt(i+1)=='C')||(str.charAt(i)=='M'&&str.charAt(i+1)=='E'))
				{
					count++;
				}
				}
				i++;
				i++;
				if(i==7)
				if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='0'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				{
					count++;
				}
				}
				i++;
				if(i==8) {
				if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='0'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				{
					count++;
				}
				}
				i++;
				if(i==9) {
				if(str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='0'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
				{
					count++;
				}
				}
				
			if(count==9)
			{
				System.out.println("Sucess");
			}
			else
			{
				System.out.println("Failure");
			}
		}
	}

