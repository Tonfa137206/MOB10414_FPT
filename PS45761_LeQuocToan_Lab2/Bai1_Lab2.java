package Code_Lab2;

import java.util.Scanner;

public class Bai1_Lab2 {
	public static void giaiPTB1(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem!");
			}
			else {
				System.out.println("Phuong trinh vo nghiem!");
			}
		} else {
			double nghiem = -b/a;
			System.out.println("Phuong trinh co nghiem la: " + nghiem);
		}
	}
	
	public static void ptb1() {
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so a:" );
		a =scanner.nextDouble();
		System.out.print("Nhap vao so b:" );
		b =scanner.nextDouble();
		giaiPTB1(a,b);
	}
	public static void main(String[] args) {
		ptb1();
	}

}
