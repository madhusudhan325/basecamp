import java.util.Scanner;

public class Matrices {
	
	public static void elementsArray(int a[][], int b[][]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter elements into 1st array");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("enter elements into 2nd array");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = s.nextInt();
			}
		}
	}

	public static void multiplyStore(int c[], int a[][], int b[][]) {
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[k] = a[i][j] * b[i][j];
				k++;
			}
		}
		System.out.println("elements in thrid after multiplication");
		for (int i = 0; i < k; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int c[]) {
		for (int i = 1; i < c.length; i++) {
			int val = c[i];
			int j = i - 1;

			while (j >= 0 && c[j] > val) {
				c[j + 1] = c[j];
				j = j - 1;
			}
			c[j + 1] = val;
		}
		System.out.println("elements after sorting");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}

	public static boolean bubbleBinary(int c[], int total) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println("after bubble sort");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println();
		int r = 0;
		int y = c.length - 1;
		int mid = 0;
		while (r <= y) {
			mid = (r + y) / 2;
			if (total > c[mid]) {
				r = mid + 1;
			} else if (total < c[mid]) {
				y = mid - 1;
			} else {
				if (c[mid] == total) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean t = true;
		System.out.println("enter array size");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[] = new int[n * n];
		while (t) {
			System.out.println(
					"1.enter elements into arrays\n 2.multiply and store \n 3.sort using insertion sort 4.binary search 5.exit");
			System.out.println("enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				elementsArray(a, b);
				break;
			case 2:
				multiplyStore(c, b, a);
				break;
			case 3:
				insertionSort(c);
				break;
			case 4:
				System.out.println("enter element to search");
				int total = sc.nextInt();
				System.out.println(bubbleBinary(c, total));
				break;
			case 5:
				System.out.println("exit from program");
				System.exit(0);
			}
		}

	}

}
