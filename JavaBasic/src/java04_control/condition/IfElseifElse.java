package java04_control.condition;

import java.util.Scanner;

public class IfElseifElse {
	public static void main(String[] args) {
		
		
		
		// if ~ else if ~ else
		
//  if(���ǽ�1) {
	//���ǽ� 1�� �� �� �� �����ϴ� ����	
		
//	} else if (���ǽ�2) {
	// ���ǽ� 1�� �����̰�, ���ǽ� 2�� �� �� �� �����ϴ� ����
		
//	} else if (���ǽ�3) {
		// ���ǽ� 1�� �����̰� ���ǽ�2�� �����̰� ���ǽ�3�� ���� �� �����ϴ� ����
		
//	} else {	
		// ���ǽ� 1,2,3, ��� ������ �� �����ϴ� ����
//	}
	// ** else if ������ �ۼ��� �� �ִ� ���� ������ ���Ѿ���
	// ** else if, else ������ �ʼ��� �ƴϴ�
	// ** else�� ����ϴ� ������ if�� ��ü�� ���������θ� 1�� �� �� ����
	// ** if�� ���� �ܵ����� else if, else�� ����� �� ����
	//---------------------------------------------------------------------
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input Number : ");
	int num = sc.nextInt();
	
	if (num == 10 ) {
		System.out.println("10�Դϴ�");
	} else if (num == 20 ) {
		System.out.println("20�Դϴ�");
	} else if (num == 30) {
		System.out.println("30�Դϴ�");
	}
		
	}
}
