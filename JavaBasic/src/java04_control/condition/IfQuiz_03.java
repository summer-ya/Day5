package java04_control.condition;

import java.util.Scanner;

public class IfQuiz_03 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in); //�Է� ��ü
		//--------------------------------------------------
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		
		
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
	
		if (num1 > num2) {// num1�� ū ���
			System.out.println(num1 + "��/�� Ů�ϴ�");
		}
		if (num1 < num2 ) { //num2�� ū ���
			System.out.println(num2 + "��/�� Ů�ϴ�");
		}
		if (num1 == num2 ) { //���� ���
			System.out.println("�� ���ڰ� " + num1 +"(��)�� �����ϴ�");
		}
	}
}

