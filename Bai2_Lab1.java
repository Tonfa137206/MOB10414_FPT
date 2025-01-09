package Lab1;
import java.util.Scanner;

public class Bai2_Lab1 {
    public static void main(String[] args) {
        // Sử dụng Scanner để nhập giá trị từ bàn phím
        Scanner scanner = new Scanner(System.in);
        //Nhâp cạnh A
        System.out.print("Nhập cạnh A: ");
        double canhA = scanner.nextDouble();
        //Nhập cạnh B
        System.out.print("Nhập cạnh B: ");
        double canhB = scanner.nextDouble();
        //Tính Chu vi, Diện tích, Cạnh ngắn
        double chuVi = 2 * (canhA + canhB);
        double dienTich = canhA * canhB;
        double canhNgan = 0;
        if(canhA > canhB) {
        	canhNgan = canhB;
        } else {
        	canhNgan = canhA;
        }
        //Xuất và hiển thị giá trị lên màn hình
        System.out.println("Diện tích HCN = "+ dienTich);
        System.out.println("Chu vi HCN = "+ chuVi);
        System.out.println("Cạnh ngắn HCN = "+ canhNgan);
    };
}
