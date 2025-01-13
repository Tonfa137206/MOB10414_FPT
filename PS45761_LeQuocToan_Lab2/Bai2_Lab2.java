package Code_Lab2;

import java.util.Scanner;

public class Bai2_Lab2 {
	public static void giaiPTB2(double a, double b, double c) 
	//Kiem tra he so
{
	if (a == 0){
		Bai1_Lab2.giaiPTB1(a, b);
	} else{
		//tinh delta
		double delta = (b * b) - (4 * a * c);
		double x1, x2;
		//tinh nghiem
		if (delta > 0) {
			x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.print("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + " va x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.print("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
		}else {
			System.out.println("Phuong trinh vo nghiem");
		}
	}

	}
	public static void ptb2() {
		double a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a = scanner.nextDouble();
		System.out.print("Nhap b: ");
		b = scanner.nextDouble();
		System.out.print("Nhap c: ");
		c = scanner.nextDouble();
		giaiPTB2(a,b,c);
	}
	
	public static void main(String[] args) {
		ptb2();
	}
}
