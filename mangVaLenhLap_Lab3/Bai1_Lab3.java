package mangVaLenhLap_Lab3;
import java.util.Scanner;
public class Bai1_Lab3 {
	private static Scanner scanner;

	public static void main(String[] args) {
		int integer;
		
		Scanner scanner = new Scanner(System.in);
			System.out.print("Nhap vao so can kiem tra: ");
			integer = scanner.nextInt();			
			Boolean soNguyenTo = true;
			for (int i = 2; i < integer; i++) {
				if (integer % i == 0) {
					soNguyenTo = false;
					break;
				}
			}
			if ( soNguyenTo == true) {
				System.out.printf("%d la so nguyen to!", integer);
			} else {
				System.out.printf("%d khong phai la so nguyen to!", integer);
			}
	}
		
}
