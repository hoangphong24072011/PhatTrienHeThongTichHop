import java.util.Scanner;

public class nhapChuoiKiTu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao Chuoi : ");
        String text = scanner.nextLine();
        System.out.println(text.toUpperCase());
    }
} 

