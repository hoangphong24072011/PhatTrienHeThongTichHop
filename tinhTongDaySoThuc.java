
import java.io.*;
import java.util.Scanner;
public class tinhTongDaySoThuc {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N");
        int n = scanner.nextInt();
        
        float a[] = new float[n];

        for (int i=0; i<a.length; i++)
            {
                System.out.print("Nhap phan tu thu"+(i+1)+": ");
                a[i] = scanner.nextFloat();
            } 
        float count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] >= 0){
                count += a[i];
            }
        }
        System.out.println(count);

    }
}
