package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	
	// �ﰢ�� ���� ������
	// �ﰢ�� ���� = ( �غ� * ����) /2
	// �غ��� ���̸� �Է¹޾� ���
	
	// 1. �ʿ��� ���� ���� (+ ������Ÿ�� ����)
	
	
	// 2. ������ �Է�
	// 3. ������ �־��� ��� ����
	// 4. ��� ���
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�غ��� �Է��ϼ���");
//		String str = sc.nextLine();
//		int bottom = 10;
//		
//		System.out.print("���̸� �Է��ϼ���");
//		int height = 10;
//		height = sc.nextInt();
//		
//		
//		System.out.print("���̸� �Է��ϼ���");
//		int height1 = 10;
//		height = sc.nextInt();
//		
//		
//		
//		System.out.println("�ﰢ�� ���� : " + (bottom * height)/2);  // ���� ���� �ڵ�
		
		
		//1.
		int base ; //�غ�
		int height; //����
		double area; //����
		
		//2.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�غ���? ");
		base = sc.nextInt();
		
		System.out.print("���̴�? ");
		height = sc.nextInt();
		
		//3.
		area = (base * height) / (double)2;
		
		//4.
		System.out.println();
		System.out.println("���� : " + area);
	}

}
