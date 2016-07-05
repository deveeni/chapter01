package chapter01;

public class CastingTest {

	public static void main(String[] args){
		int i =100;
		long l = i;
		
		System.out.println(l);
		
		long l2 = 200;
//		int j = l2;  컴파일러가 놀람 8바이트 l2를 int 4바이트 j에 옮기려 함 
//		들어가는데 깨지진 않는다. 그러나 컴파일 할때 깨질수도 있다. 제대로 캐스팅 하라. 컴파일러가 알려주는것.
		
		int j = (int)l2; //명시적 캐스팅
		
		
	}
}
