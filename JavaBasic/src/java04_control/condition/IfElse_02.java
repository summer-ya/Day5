package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		//�Է��� ���ڰ� ¦��/Ȧ������ �Ǻ��ϴ� �ڵ�
		if( num%2 == 0 ) { //¦��, 2�� ���
			System.out.println("num[" + num + "] - ¦��");
		} else { //Ȧ��, 2�� ����� �ƴ�
			System.out.println("num[" + num + "] - Ȧ��");
		}
	}	
}
