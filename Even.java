package prgrm1;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n = sc.nextInt();
		 int count=0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				count++;
				System.out.println("even numbers are" + i);
				System.out.println("count no:" + count);

			}
		}

	}

}
