package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		// �л� ���� ���� ���α׷�
		// �̸�, ����, ����, ����, ����, ����
		//6���� ���� ������ �� �ִ� ������ ����� ������ ����� ������ ����� ���
		
//		String name;
//		int age;
//	    char gender;
//		int Korea;
//		int English;
//		int Mathmatics;
//		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.print("�̸�");
//		name = sc.nextLine();
//		
//		System.out.print("����");
//		age = sc.nextInt();
//		
//		System.out.print("����");
//	char gender = sc.nextLine().charAt(0);
//		
//		System.out.print("����");
//		Korea = sc.nextInt();
//		
//		System.out.println("����");
//		English = sc.nextInt();
//		
//		System.out.println("����");
//		Mathmatics = sc.nextInt();
//		
//		System.out.println("����");
//		System.out.println(Korea + English + Mathmatics);
//		
//		System.out.println("���");
//		System.out.println(average);
		
		
//		
		// ������ Ÿ���� �⺻��
//		String name = null; // ������ �⺻ ������ null
//		int age = 0;  // ������ �⺻ ������ 0
//		double average = 0.0; // �Ǽ��� �⺻ ������ 0.0
//		boolean isEmpty = false; //���� �⺻ ������ false
//		char gender = '\0'; // ���ڰ� �⺻ ������ '\0' (�ι���, null����)
		//--------------------------------------------------------------------------
		
		// �̸� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = sc.nextLine();
		
//		System.out.println("[TEST] name : " + name);
		
		
		// ���� �Է�
		System.out.print("Input Age : ");
		int age = sc.nextInt();
//		System.out.println("[TEST] age : " + age);
		
		sc.nextLine(); //�Է� ���� �����
		
		// ���� �Է�
		System.out.print("Input Gender : ");
		char gender = sc.nextLine().charAt(0);
		
//		System.out.println("[TEST] gender : " + gender);
		
		// ���� �Է� - ����, ����, ����
		
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		
		System.out.print("Input Enlglish : ");
		int eng = sc.nextInt();
		
		System.out.print("Input Math : ");
		int math = sc.nextInt();
		
//		System.out.print("[TEST] ���� : " + kor + "," + eng + "," + math);
		
		//--------------------------------------------------------------------
		
		// ���� ����ϱ�
		int sum = kor + eng + math;
		
		// ��� ����ϱ�
		double avg = sum / (double)3;
//		System.out.println("[TEST] sum : " + sum);
//		System.out.println("[TEST] avg : " + avg);
		
		System.out.println();
		System.out.println("--- ��� ---");    //\t  -> tapŰ ������ ó�� �鿩����
		
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(sum + "\t");
		
//		System.out.println(avg + "\t");
		System.out.printf("%.2f", avg); //�Ҽ��� ��°�ڸ����� ���
		
	}

}
