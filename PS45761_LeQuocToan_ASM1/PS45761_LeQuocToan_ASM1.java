package ASM;

import java.util.Scanner;

public class ASM_GD1 {
		private static int choice;
		public static void main(String args[]) {
			int choice = 0;
			
			do {
			System.out.println("+-------------------------------+");
			System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
			System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
			System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
			System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
			System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
			System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
			System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
			System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
			System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
			System.out.println("0. Thoat!");
			System.out.println("+-------------------------------+");
			System.out.println("Vui long chon so: ");
			Scanner scanner = new Scanner(System.in);
			
			choice = scanner.nextInt();
			switch(choice) {
				case 1:
					nhapDanhSachNhanVien ();
					break;
				case 2:
					xuatDanhSachSinhVien();
					break;
				case 3:
					timVaHienThiSinhVienTheoMa();					
					break;
				case 4:
					xoaNhanVienTheoMa();
					break;
				case 5: 
					capNhatThongTinNhanVien();
					break;
				case 6:
					timCacNhanVienTheoKhoangLuong();
					break;
				case 7:
					sapXepNhanVienTheoHoVaTen();
					break;
				case 8:
					sapXepNhanVienTheoThuNhap();
					break;
				case 9:
					xepNamNhanVienThuNhapCaoNhat();
					break;
				case 0:
					
					System.out.println("Cook!");
					break;
				default:
					System.out.println("Nhap sai, vui long nhap lai!");
					scanner.nextLine();
					continue;
			}
			
			} while (choice != 10);
			Scanner scanner = null;
			scanner.close();			
			
		}
		
		public static void nhapDanhSachNhanVien () {
			System.out.println("Nhập danh sách nhân viên");
		}
		public static void xuatDanhSachSinhVien () {
			System.out.println("Xuất danh sách nhân viên");
		}
		public static void timVaHienThiSinhVienTheoMa () {
			System.out.println("Tìm và hiển thị nhân viên");
		}
		public static void xoaNhanVienTheoMa () {
			System.out.println("Xóa nhân viên theo mã");
		}
		public static void capNhatThongTinNhanVien () {
			System.out.println("Cập nhật thông tin nhân viên theo mã");
		}
		public static void timCacNhanVienTheoKhoangLuong () {
			System.out.println("Tìm các nhân viên theo khoảng lương");
		}
		public static void sapXepNhanVienTheoHoVaTen () {
			System.out.println("Sắp xếp nhân viên theo họ và tên");
		}
		public static void sapXepNhanVienTheoThuNhap () {
			System.out.println("Sắp xếp nhân viên theo thu nhập.");
		}
		public static void xepNamNhanVienThuNhapCaoNhat () {
			System.out.println("Xuất 5 nhân viên có thu nhập cao nhất.");
		}
		public static void thoat () {
			System.out.println("Thoat!");
		}
		
	}

	
	
