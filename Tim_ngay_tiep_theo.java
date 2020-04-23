import java.util.Scanner;

public class Tim_ngay_tiep_theo {
public static int checkYear(int year)
{
	if((year %4 ==0&& year%100==0) ||year %400 ==0  )
		{
		System.out.println("Năm nhuận");
		}
		else 
		{
		System.out.println("Năm không nhuận");
		}
	
	return year;
}
public static int Ngaytrongthang(int thang)
{
	int ngay=0;
	int year =0;
	if(thang< 1|| thang >12)
		{
		ngay =-1;
		}
	else
	{
		switch(thang)
		{
		case 1:  case 3: case 5: case 7: case 8: case 10 : case 12:
			{
				ngay =31;
				break;
			}
		case 4: case 6: case 9: case 11:
			{
				ngay=30;
				break;
			}
		case 2:
			{
				if(checkYear(year)== 0)
				{
					ngay =28;
				}
				else
				{
					ngay =29;
				}
				break;
			}
		}
		
	}
	return ngay;
	
}
public static int Next_day(int ngay, int thang, int year)
{
	int dem_ngay;
	dem_ngay= Ngaytrongthang(thang);
	if(dem_ngay == -1 || dem_ngay <0 || ngay> dem_ngay)
	{
		return -1;
	}
	else 
	{
		if(dem_ngay> ngay)
		{
			ngay ++;
		}
		else if(thang!=12)
		{
			ngay =1;
			thang ++;
		}
		else
		{
			ngay = thang =1;
			year ++;
		}
	}
	System.out.println("Ngày tiếp theo: "+ ngay +" tháng " + thang + " năm "+year);
	return 1;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào
		int ngay,thang,year;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Nhập ngày : ");
		ngay=Integer.parseInt(scan.nextLine());
		System.out.println("Nhập tháng: ");
		thang=Integer.parseInt(scan.nextLine());
		System.out.println("Nhập năm: ");
		year=Integer.parseInt(scan.nextLine());
		// Đầu ra
		checkYear(year);
		Ngaytrongthang(thang);
		Next_day(ngay, thang, year);
		
	}

}
