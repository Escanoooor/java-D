import java.util.Scanner;

public class Tim_Tam_Giac {
public static void Check_tam_giac(float a, float b, float c)
{ 
	if(a+b > c || a+c> c || b+c > a)
	{
		System.out.println("Đây là tam giác");
		if(a == b || a == c || b == c)
		{
			System.out.println("Đây là tam giác cân");
		}
		else if( a==b && a == c && b == c)
		{
			System.out.println("Đây là tam giác đầu");
		}
		else if( a*a == b*b+c*c || b*b == a*a+c*c || c*c== a*a+b*b)
		{
			System.out.println("Đây là tam giác vuông");
		}
		else
		{
			System.out.println("Đây là tam giác vuông cân");
		}
	}
	else
	{
		System.out.println("Đây không phải là tam giác");
	}
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		//Đầu vào
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập cạnh a: ");
		a=Float.parseFloat(scan.nextLine());
		System.out.println("Nhập cạnh b: ");
		b=Float.parseFloat(scan.nextLine());
		System.out.println("Nhập cạnh c: ");
		c=Float.parseFloat(scan.nextLine());
		// Xử lý và đầu ra
		Check_tam_giac(a, b, c);
	}

}
