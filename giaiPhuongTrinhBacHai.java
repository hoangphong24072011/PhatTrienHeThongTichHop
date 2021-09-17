

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class giaiPhuongTrinhBacHai {
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co hai nghiem "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
    public static void main(String[] args) throws IOException 
    {
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in) );
    //  Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so 2, a = ");
        // float a = sc.nextFloat();
        float a = dataIn.read();
        System.out.print("Nhap he so 1, b = ");
        // float b = sc.nextFloat();
        float b = dataIn.read();
        System.out.print("Nhap hang so , c = ");
        // float c = sc.nextFloat();
        float c = dataIn.read();

        giaiPTBac2(a, b, c);
    }
}
