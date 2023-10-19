package bt2.timSoLonNhatTrongMangSoNguyen;

public class Main {

    public static void main(String[] args) {
//    B1: khởi tạo một mảng số nguyên arr với các giá trị cụ thể.
        int[] arr = {5, 7, 3, 6, 4, 9, 2};
//    B2: sử dụng một khối try-catch để bắt ngoại lệ và xử lý nếu có ngoại lệ được ném ra từ phương thức findMax.
        try {
//    B3: Trong khối try, chúng ta gọi phương thức findMax với tham số là mảng arr và gán giá trị trả về vào biến max.
            int max = findMax(arr);
//    B4: Nếu không có ngoại lệ nào được ném ra từ findMax, chúng ta in ra màn hình số lớn nhất trong mảng.
            System.out.println("Số lớn nhất trong mảng là: " + max);
//    B5: Nếu có ngoại lệ EmptyArrayException được ném ra từ findMax, chúng ta bắt ngoại lệ đó trong khối catch và in ra màn hình thông báo lỗi.
        } catch (EmptyArrayException e) {
            System.out.println(e.getMessage());
        }
    }

//    B6: Trong phương thức findMax, chúng ta kiểm tra điều kiện arr.length == 0 để xác định xem mảng có phần tử hay không.
    public static int findMax(int[] arr) throws EmptyArrayException {
//
//    B7: Nếu mảng không có phần tử, chúng ta ném ra ngoại lệ EmptyArrayException với thông điệp "Mảng rỗng".
        if (arr.length == 0) {
            throw new EmptyArrayException("mảng rỗng");
        } else {
//     B8: Nếu mảng có phần tử, chúng ta tìm số lớn nhất trong mảng thông qua một vòng lặp và trả về giá trị số lớn nhất đó.
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

//    B9: Trong lớp EmptyArrayException, chúng ta định nghĩa một lớp ngoại lệ tùy chỉnh với thông điệp được truyền vào để hiển thị thông báo lỗi.
    static class EmptyArrayException extends Exception {
        public EmptyArrayException(String message) {
            super(message);
        }
    }
}
