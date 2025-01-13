package Code_Lab2;

import java.util.Scanner;

public class Bai3_Lab2 {
	 public static void tinhTienDien() {
		 double soDien, tien;
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhap vao so dien: ");
		 soDien = scanner.nextInt();
		 if (soDien < 50) {
			 tien = soDien * 1000;
		 }else {
			 tien = 50 * 1000 + (soDien - 50) * 1200;
		 }
		 System.out.println("So tien phai tra la: " + tien + "VND");
	 }
	 
	 public static void main(String[] args) {
		 tinhTienDien();
	 }
}
