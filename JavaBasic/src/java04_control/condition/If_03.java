package java04_control.condition;

import java.util.Scanner;

public class If_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // �Է� ��ü
		
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		
		if (input == 10 ) {
			System.out.println("�Է��� ���� 10�̴�");
		}
		if (input != 10) {
			System.out.println("�Է��� ���� 10�� �ƴϴ�");
		}
		System.out.println("----------------------");
		
		if(input >= 1 && input <= 100) {
			System.out.println("�Է��� ���� 1~100 ������ ����");
		}
	}

}
