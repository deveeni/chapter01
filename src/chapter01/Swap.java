package chapter01;
import java.util.Scanner;


public class Swap {

	public static void main(String args[]){
		int n1 = 10;
		int n2 = 30;
		int temp=0;

		// Q1: n1���� �׻� ū ���� �ǵ���, �ʿ��� ��� n1�� n2�� ��ü�϶�.
		if(n1<n2){
			temp=n1;
			n1=n2;
			n2=temp;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		
		// Q2: �ִ밪�� �Ǻ��ϴ� ������ �ϼ��� ������.
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int result = 0;
		String result2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("A ���� �Է��ϼ���.");
		a1 = scan.nextInt();
		System.out.println("B ���� �Է��ϼ���.");
		a2 = scan.nextInt();
		System.out.println("C ���� �Է��ϼ���.");
		a3 = scan.nextInt();
		
		if (a1 >= a2) {
			if (a1 >= a3){
				System.out.println(a1);
			}else{
				System.out.println(a3);
			}
		}else {
			if(a2 >= a3){
				System.out.println(a2);
			}else{
				System.out.println(a3);
			}
		}
//		if (a1 >= a2) {
//			result= a1;
//			result2="A";
//		} else {
//			result= a2;
//			result2="B";
//		}
//		
//		if (result >= a3){
//			
//		} else {
//			result = a3;
//			result2="C";
//		}
//		System.out.println("�ִ밪�� "+result2+":"+result+"�Դϴ�.");
	}
}
