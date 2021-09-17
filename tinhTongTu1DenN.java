
import java.io.*;

public class tinhTongTu1DenN {
    public static int tongN(int n){
        int count = 0;
        for(int i = 0; i <= n; i++){
            count = count + i;
        }
        return count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader(new
        InputStreamReader( System.in) );
        System.out.println("Nhap N");
        int n = dataIn.read();
        System.out.println(tongN(n));
    }
}
