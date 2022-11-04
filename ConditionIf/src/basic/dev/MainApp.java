package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập a");
		double a = sc.nextDouble();
		System.out.println("Nhập b");
		double b = sc.nextDouble();
		System.out.println("Nhập c");
		double c = sc.nextDouble();

		if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println(" Đây là tam giác");

		}else {
			
			System.out.println(" không phải tam giác");
		}
			
		
	}

}
