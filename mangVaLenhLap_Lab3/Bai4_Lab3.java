package mangVaLenhLap_Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4_Lab3 {
	public static void sortsinhVien(String sinhVien[], float diemSinhVien[]) {
		for (int i = 0; i < sinhVien.length - 1; i++) {
			for (int j = i + 1; j < sinhVien.length; j++) {
				if (diemSinhVien[i] > diemSinhVien[j]) {
					float temp = diemSinhVien[i];
					diemSinhVien[i] = diemSinhVien[j];
					diemSinhVien[j] = temp;
					String sinhVienTemp = sinhVien[i];
					sinhVien[i] = sinhVien[j];
					sinhVien[j] = sinhVienTemp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String sinhVien[] = new String[4];
		float diemSinhVien[] = new float[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.printf("Nhap ten cho sinh vien thu [%d]: ", i + 1);
			sinhVien[i] = scanner.nextLine();
			System.out.printf("Nhap diem cho sinh vien thu [%d]: ", i + 1);
			diemSinhVien[i] = scanner.nextFloat();			
			scanner.nextLine();
		}
		System.out.println("Mang sinh vien: " + Arrays.toString(sinhVien));
		System.out.println("Mang diem sinh vien: " + Arrays.toString(diemSinhVien));
		sortsinhVien(sinhVien, diemSinhVien);
		for (int i = 0; i < 4; i++) {
			System.out.println("Ho ten: " + sinhVien[i]);
			System.out.println("Diem: " + diemSinhVien[i]);
			if (diemSinhVien[i] >= 9) {
				System.out.println("Hoc luc: Xuat sac!");					
				}else if (diemSinhVien[i] >= 7.5) {
				System.out.println("Hoc luc: Gioi!");	
			} else if (diemSinhVien[i] >= 6.5) {
				System.out.println("Hoc luc: Kha!");
			} else if (diemSinhVien[i] >= 5) {
				System.out.println("Hoc luc: TrungBinh!");
			} else {
				System.out.println("Hoc luc: Yeu!");
			}
			System.out.println();
		}
	}
}
