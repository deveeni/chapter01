package chapter01;

public class LeapYear {

	public static void main(String args[]){
		int year = 0;
		
		for (year = 1990; year<=2015; ++year){
			if( year % 4 == 0){
				System.out.println("-"+year+"���� �Դϴ�.");
			}else{
				System.out.println(year+"������ �ƴմϴ�.");
			}
			
		}
	}
}
