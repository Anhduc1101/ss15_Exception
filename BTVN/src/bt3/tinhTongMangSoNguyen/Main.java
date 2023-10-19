package bt3.tinhTongMangSoNguyen;

public class Main {
    public static void main(String[] args) {
        Object[] arr = {1.5, 2, 3.2, 4, 5, 6.7,"a","b"};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum = sum + (int) arr[i];
            } catch (ClassCastException e) {
                System.out.println(arr[i]+" không phải số nguyên");
            }
        }
            System.out.println(sum);
    }
    }
