 
import java.util.Scanner;

public class diem {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public diem(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public diem() {
		super();
		
	}
	public void nhapToaDo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap toa do x: ");
		this.x=sc.nextInt();
		
		System.out.print("\nNhap toa do y: ");
		this.y=sc.nextInt();
	}
	public void inToaDo() {
		System.out.print("Toa do: ");
		System.out.println("("+x+","+y+")");
	}
	public void tinhKhoangCach() {
		double khoangCach= Math.sqrt(x*x+y*y);
		System.out.println("Khoang cach tu toa do (" + x +","+ y+"): "+ khoangCach);
	}
	public static void main(String[] args) {
		diem first= new diem(80,90);
		diem second= new diem(100,120);
		diem nhaptd1 = new diem();
		first.inToaDo();
		second.inToaDo();
		first.tinhKhoangCach();
		second.tinhKhoangCach();
		nhaptd1.nhapToaDo();
		nhaptd1.inToaDo();
		nhaptd1.tinhKhoangCach();
	}
}