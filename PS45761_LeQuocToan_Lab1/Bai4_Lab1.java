package Lab1;
import java.util.Scanner;
public class Bai4_Lab1 {
	public static void main(String[] args) {
		// Sử dụng Scanner để nhập giá trị từ bàn phím
		Scanner scanner = new Scanner(System.in);
		//Khai báo dữ liệu dạng float
		float a,b,c;
		//Nhập a
		System.out.print("Nhập vào a: ");
		a = scanner.nextFloat();
		//Nhập b
		System.out.print("Nhập vào b: ");
		b = scanner.nextFloat();
		//Nhập c
		System.out.print("Nhập vào c: ");
		c = scanner.nextFloat();
		//Kiểm tra giá tri, tính delta, xuất căn delta ra màn hình
		float delta = (float) Math.pow(b, 2) - (4 * a * c);
		if (delta < 0) {
            System.out.println("Delta là số âm, phương trình vô nghiệm trong tập số thực.");
        } else {
            System.out.println("Căn delta là: " + Math.sqrt(delta));
        }
	}
}
