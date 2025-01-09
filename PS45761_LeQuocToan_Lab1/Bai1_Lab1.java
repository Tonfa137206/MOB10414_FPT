package Lab1;
import java.util.Scanner;

public class Bai1_Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập tên sinh viên
        System.out.print("Tên Sinh Viên: ");
        String hoten = scanner.nextLine();
        
        // Nhập điểm trung bình
        System.out.print("Điểm Trung Bình: ");
        double diemtb = scanner.nextDouble();
        
        // Hiển thị tên sinh viên và điểm trung bình với định dạng 2 chữ số thập phân
        System.out.printf("%s %.2f điểm\n", hoten, diemtb);
    }
}
