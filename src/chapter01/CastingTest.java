package chapter01;

public class CastingTest {

	public static void main(String[] args){
		int i =100;
		long l = i;
		
		System.out.println(l);
		
		long l2 = 200;
//		int j = l2;  �����Ϸ��� ��� 8����Ʈ l2�� int 4����Ʈ j�� �ű�� �� 
//		���µ� ������ �ʴ´�. �׷��� ������ �Ҷ� �������� �ִ�. ����� ĳ���� �϶�. �����Ϸ��� �˷��ִ°�.
		
		int j = (int)l2; //����� ĳ����
		
		
	}
}
