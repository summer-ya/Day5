package java03_scanner;

import java.util.Scanner;

public class Scanner_04 {
	public static void main(String[] args) {
		
		// �Է� ��ü
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----�Է�----");
		
		System.out.println("Input Number: ");
		int num = sc.nextInt(); //������ �Է¹ޱ�
		
		sc.nextLine(); //�Է� ���ۿ� ���� '\n'�����Ѵ� -> �Է� ���� ����
		
		System.out.println("Input String: ");
		
		sc.skip("[\\r\\n]+"); //������ ��� '\r', '\n'�� �����Ѵ� -> �Է� ���� ����
		int str = sc.nextInt(); //���ڿ� �Է¹ޱ�
		
		System.out.println("----���----");
		System.out.println("���� : " + num);
		System.out.println("���ڿ� : " + str);
	}

}
