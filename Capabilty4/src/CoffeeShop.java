import java.util.Scanner;

class Coffee {
	String name;
	String mobile;
	double feedb;

	Coffee(String n, String m, double fb) {
		name = n;
		mobile = m;
		feedb = fb;
	}

	Coffee() {

	}

}

public class CoffeeShop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coffee cs1 = new Coffee();
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		Coffee[] shop = new Coffee[size];
		System.out.println("Enter details");
		for (int i = 0; i < shop.length; i++) {
			System.out.println("Enter name of customer");
			String n = sc.next();
			System.out.println("Enter mobile number");
			String m = sc.next();
			System.out.println("Enter feedback rating");
			double fb = sc.nextDouble();
			Coffee cs = new Coffee(n, m, fb);
			shop[i] = new Coffee(n, m, fb);
		}
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + shop[i].feedb;
		}
		double avg = sum / size;
		System.out.println("Average rating is " + avg);
		for (int i = 0; i < size; i++) {
			if (shop[i].feedb > avg) {
				System.out.println(shop[i].name + " has given high rating with " + shop[i].feedb);
			} else {
				System.out.println(shop[i].name + " shas given less rating with " + shop[i].feedb);
			}
		}
	}
}
