package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Nhập tên: ");
         String ten = sc.next();
         
         System.out.print("Nhập tuổi: ");
         int tuoi = sc.nextInt();
         
         System.out.print("Nhập điểm: ");
         double diem = sc.nextDouble();
         
         System.out.println("Tên: " + ten);
         System.out.println("Tuổi:" + tuoi);
         System.out.println("Điểm:" + diem);
	}

}
