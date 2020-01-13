import java.util.Scanner;
public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//System.out.println(mul(5));
		mul(5);
		in.close();
	}
	public static int mul(int n)
	{
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		return m*n;
	}

}
