package Code_Lab2;

import java.util.Scanner;

public class Bai4_Lab2 {
	public static void menu() {
		System.out.println("+-------------------------------+");
		System.out.println("1. Giai phuong trinh bac 1");
		System.out.println("2. Giai phuong trinh bac 2");
		System.out.println("3. Tinh tien dien");
		System.out.println("4. Thoat!");
		System.out.println("+-------------------------------+");
		System.out.println("Vui long chon so: ");
		Scanner scanner = new Scanner(System.in);
		int chon = scanner.nextInt();
		switch(chon) {
			case 1:
				Bai1_Lab2.ptb1();
				break;
			case 2:
				Bai2_Lab2.ptb2();
				break;
			case 3:
				Bai3_Lab2.tinhTienDien();
				break;
			case 4: break;
			default:
				System.out.println("Nhap sai, vui long nhap lai!");
		}
	}
	
	public static void main(String[] args) {
		menu();
	}
}
