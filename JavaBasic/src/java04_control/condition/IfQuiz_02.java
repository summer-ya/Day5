package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//3�� ��� ���� �ϳ� �Է¹ޱ�
		System.out.print("Input Number : ");
		int input = sc.nextInt();
		if (input%3 != 0) {
			System.out.println("3�� ����� �ƴմϴ�");
		}
		if (input%3 == 0) {
			System.out.println("3�� ����Դϴ�");
		}
		
		// if(num%3 == 0 && num!= 0 ) { //3�� ���
		//System.out.println("num["+num+"]��/�� 3�� ����̴�");
		//}
		// if (num%3 !=0 || num==0 {// 3�� ����� �ƴ�
		//System.out.println("num["+num+"]��/�� 3�� ����� �ƴϴ�");
		//}
	}

	}
