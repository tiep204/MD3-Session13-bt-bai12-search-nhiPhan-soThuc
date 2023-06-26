import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thuc");
        double key = Double.parseDouble(sc.nextLine());
        double low = 0;
        double hight = arr.length - 1;
        while (low != hight) {
            int mid = (int) ((low + hight) / 2);
            if (arr[mid]==key){
                System.out.println("phan tu ban tim kiem co vi tri la "+mid);
            } else if (key<arr[mid]) {
                hight = mid-1;
            }else {
                low = mid+1;
            }
        }
        if (low==hight){
            if (key==arr[(int) low]){
                System.out.println("phan tu ban tim kiem co vi tri la "+low);
            }else {
                System.out.println("khong tim thay");
            }
        }
    }
}