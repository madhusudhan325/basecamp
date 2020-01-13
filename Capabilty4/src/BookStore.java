import java.util.Scanner;

class Store {
	String author;
	String title;
	String price;
	int year;

	public String getAuthor() {
		return author;
	}

	public String setAuthor(String a) {
		return author = a;
	}

	public String getTitle() {
		return title;
	}

	public String setTitle(String t) {
		return title = t;
	}

	public String getPrice() {
		return price;
	}

	public String setPrice(String p) {
		return price = p;
	}

	public int getYear() {
		return year;
	}

	public int setyear(int y) {
		return year = y;
	}

	Store(String a, String t, String p, int y) {
		author = a;
		title = t;
		price = p;
		year = y;
	}
}

public class BookStore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Author Name:");
		String a = sc.nextLine();
		System.out.println("Enter Title Name :");
		String t = sc.nextLine();
		System.out.println("Enter Price of book :");
		String p = sc.nextLine();
		System.out.println("Enter year of book published:");
		int y = sc.nextInt();
		sc.close();
		Store bs = new Store(a, t, p, y);
		System.out.println("Author Name is :" + bs.getAuthor());
		System.out.println("Title Name is :" + bs.getTitle());
		System.out.println("Price of book is :" + bs.getPrice());
		System.out.println("published year is :" + bs.getYear());
	}

}
