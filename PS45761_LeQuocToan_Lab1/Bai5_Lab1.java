package Lab1;
import java.util.Scanner;

public class Bai5_Lab1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào 3 số nguyên
        System.out.print("Nhập số A: ");
        int soA = scanner.nextInt();
        
        System.out.print("Nhập số B: ");
        int soB = scanner.nextInt();
        
        System.out.print("Nhập số C: ");
        int soC = scanner.nextInt();
        
        // Tính trung bình (ép kiểu sang double)
        double trungBinh = (double)(soA + soB + soC) / 3;
        
        // In kết quả, lấy 2 số sau phẩy
        System.out.printf("Trung bình của 3 số là: %.2f\n", trungBinh);
    }
}
