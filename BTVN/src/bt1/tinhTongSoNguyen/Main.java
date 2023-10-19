package bt1.tinhTongSoNguyen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Tính tổng 2 số nguyên nhập từ àn phím: ");
                System.out.println("Nhập số thứ nhất: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập số thứ hai: ");
                int b = Integer.parseInt(scanner.nextLine());
                int c = a + b;
                System.out.println("Tổng của 2 số nguyên là: " + c);
                return;
            }catch (NumberFormatException e){
                System.out.println("Bạn phải nhập vào 1 số, không được nhập vào chữ !.Mời nhập lại: ");
            }
        }
    }
}
