package java04_control.condition;

// �鿩���� ���� ����Ű : ctrl +i ��ü ���� �� �Ŀ�
public class IfElse_03 {
	public static void main(String[] args) {

		int num = 33;

		if (num > 0 && num <= 100) {
			System.out.println("1~100 ������ ����");
		}

		System.out.println("----------------------------");

		if( num>0 ) {
			System.out.println("0���� ũ��");

			if(num <= 100) {
				System.out.println("0���� ũ��");
				System.out.println("100���� �۰ų� ����");

			}
			System.out.println("0���� ũ��");
		} else {
			System.out.println("0���� ũ�� �ʴ�");

			if ( num == 0) {
				System.out.println("0�� ����");
			} else {
				System.out.println("0���� �۴�");
			}
		}
	}

}
