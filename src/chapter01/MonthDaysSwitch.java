package chapter01;

public class MonthDaysSwitch {

	public static void main(String[] args) {
		int month = 4;
		int days = -1;
		
		switch (month){ //equal 조건일때 사용할 수 있다. 
		case 1:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 30;
			break;
		default:
			days =0;
			break;
		}
		System.out.println(month + "월은 " + days +"일 까지 있습니다.");
	}

}
