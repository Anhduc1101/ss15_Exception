package bt4.chuyenDoiChuoiVeSoNguyen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi số nguyên: ");
        String input = scanner.nextLine();

        // Bước 2: Tạo List số nguyên
        List<Integer> numbers = new ArrayList<>();

        // Bước 3: Duyệt chuỗi và ép kiểu từng phần tử về Integer
        for (char c : input.toCharArray()) {
            try {
                int num = Integer.parseInt(String.valueOf(c));
                numbers.add(num);
            } catch (NumberFormatException e) {
                numbers.add(0);
                System.out.println("Ký tự không phải số nguyên: " + c + ". Đã thay thế bằng 0.");
            }
        }
        // In danh sách số nguyên
        System.out.println("Danh sách số nguyên: " + numbers);
    }
}