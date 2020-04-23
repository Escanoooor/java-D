import java.util.Scanner;

/* Viết chương trình nhập vào đtb của 1 hs và xuất ra màn hình
 * Nếu dtb>8: In ra là học sinh giỏi
 * Nếu 6.5<= dtb<8: in ra học sinh khá
 * Nếu 5.0 <= dtb < 6.5: In ra học sinh trung bình
 * Nếu dtb<5 : in ra học sinh yếu
 */
public class Demo_If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Đầu vào
		float dtb;
		Scanner scan= new Scanner(System.in);
		System.out.print("Nhập vào dtb: ");
		dtb=scan.nextFloat();
		// Xử lý và đầu ra
		if(dtb >= 8)
		{
			System.out.println("Học sinh xếp loại giỏi");
		}
		else if(dtb>=6.5 && dtb <8)
		{
			System.out.println("Học sinh xếp loại khá ");
		}
		else if(dtb>5.0 && dtb<=6.5)
		{
			System.out.println("Học sinh xếp loại trung bình");
		}
		else
		{
			System.out.println("Học sinh xếp loại yếu ");
		}
	}

}
