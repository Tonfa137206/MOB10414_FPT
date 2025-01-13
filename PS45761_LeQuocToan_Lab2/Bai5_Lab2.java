package Code_Lab2;

import java.util.Scanner;

public class Bai5_Lab2 {
	public static void soLonNhat() {
		double a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so thu nhat: ");
		a = scanner.nextDouble();
		System.out.print("Nhap vao so thu hai: ");
		b = scanner.nextDouble();
		System.out.print("Nhap vao so thu ba: ");
		c = scanner.nextDouble();
		
		double max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("Số lớn nhất trong ba số là: " + max);
					 
}
		public static void main(String[] args) {
			 soLonNhat();
	}
}
