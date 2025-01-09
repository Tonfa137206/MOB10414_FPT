package Lab1;
import java.util.Scanner;

public class Bai3_Lab1 {
    public static void main(String[] args) {
        // Sử dụng Scanner để nhập giá trị từ bàn phím
        Scanner scanner = new Scanner(System.in);
      //Nhâp cạnh A, xuất giá trị
        System.out.print("Nhập cạnh A: ");
        double canhA = scanner.nextDouble();
        //Nhập cạnh B, xuất giá trị
        System.out.print("Nhập cạnh B: ");
        double canhB = scanner.nextDouble();
        //Nhập cạnh cao, xuất giá trị
        System.out.print("Nhập cạnh cao: ");
        double canhC = scanner.nextDouble(); 
        //Tính thể tích và in ra màn hình
        double theTich = canhC * (canhA * canhB);      
        System.out.println("Thể tích HCN = "+ theTich);
    };
}
