package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {
	public static void main(String[] args) {
		
		//Scanner�� �̿��� char�Է¹ޱ�
		//Scanner���� charŸ���� �Է¹޴� ����� ����
		
		//String�� char���� ��Ƴ��� ������Ÿ���̴�.
		
		//String���� �Է¹ް�, ù ���ڸ� charŸ������ ��ȯ�Ѵ�
		//-------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); // �Է� ��ü
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		System.out.println("[TEST] str : " + str);
		
		//str���ڿ��� 0��° �ε��� ���� char�� ����alpha�� �����Ѵ�
		char alpha = str.charAt(0);
		System.out.println("[TEST] alpha : " + alpha);
	}

}
