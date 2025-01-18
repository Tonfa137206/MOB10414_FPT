package mangVaLenhLap_Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3_Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;//Khai bao, nhap du lieu
		System.out.print("Nhap so phan tu mang: ");
		n = scanner.nextInt();
		int mang1[] = new int[n];
		for (int i = 0;i < n;i++) {
			System.out.printf("Nhap gia tri cho phan tu [%d] = ", i + 1);
			mang1[i] = scanner.nextInt();
		}//Xap sep mang
		Arrays.sort(mang1);
		System.out.println("Mang vua nhap da sap xep la: " + Arrays.toString(mang1));
		//phan tu nho nhat
		int min = mang1[0];
		for (int i = 0; i < n;i++) {
			if (min > mang1[i]) {
				min = mang1[i];
			}
		}	
		System.out.println("Phan tu nho nhat la: " + min);
		float count = 0;
		int tong = 0;
		for (int i = 0; i < n; i++) {
			if (mang1[i] % 3 == 0) {
				tong += mang1[i];
				count++;
			}
		}//Tinh trung binh cac so chia het cho 3
		
		if (count > 0) {
            float avg = (float) tong / count;
            System.out.println("Trung binh cac so chia het cho 3 la: " + avg);
        } else {
            System.out.println("Khong co so chia het cho 3!");
        }
		
		}		
	}

