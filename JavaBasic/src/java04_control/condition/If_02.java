package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
		
		
		int num = 10;
		
		if( num == 15 ) {
			System.out.println("HI");
		}
		System.out.println("HELLO");
		
		//-----------------------------
		
		// {}�߰�ȣ�� ���� ���� �ڵ带 �����ִ� ������ �Ѵ�
		// �ڵ� ���� ����(�帧)���� ������ ���� �ʴ´�
		
		
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		System.out.println("------------------------");
		
		// ����� �ش� ��� ������ ���� �ڵ� �� �� �Ǵ� {} �߰�ȣ �� ��Ͽ� ������ �ش�
		
		if (false) 
			System.out.println("�ڵ� 111111"); //���� �ȵ�
			System.out.println("�ڵ� 222222"); // �����
			System.out.println("------------------------");

			// ����� ������ �޴� �ڵ尡 �� ���̾ �ݵ�� {}�߰�ȣ�� ������ �Ѵ�
		if (false) {
			System.out.println("�ڵ� 111111"); //���� �ȵ�
		}
			System.out.println("�ڵ� 222222"); // �����
			
			
			
			System.out.println("------------------------");
			
			if (false); {
				System.out.println("HI"); 
				System.out.println("Hello");
				System.out.println("Hola");
			}
	}

}
