package control;

import java.util.Scanner;

public class ConditionExe {
	
	public static void main(String[] args) {
		// �� ���� 60, 70
		// �� ���� ���� ����� 100���� �Ѿ�� �հ�, ���հ�
		// ��. < ����ϱ�
		
		// �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��.
		// �ι� ° ��.
		
		int score = 60;
		int score2 = 70;
		
		if (score + score2 > 100) {
			System.out.println("�հ�");
			
		} else {
			System.out.println("���հ�");
			
		}
		
		System.out.println("��.");
		
		// �� ���� ���ؼ� ¦���̸� ¦��, Ȧ���̸� Ȧ��.
		// �ι� ° ��.
		
		int num1,num2; 
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		num1 = scn.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		num2 = scn.nextInt();
		
		int result = num1 * num2;
		
		if(result % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
			System.out.println("�ι�° ��");
			
		
		// ���� ���� ������
		// 4�� ��.
		// 2�� ����̸� 2�� ���, 3�� ����̸� 3�� ���, 2�� 3�� ���
		
			int num4 = 15;
			
			if (num4 % 2 == 0 && num4 % 3 == 0) {
				System.out.println("2�� ���");
			} 	else if (num4 % 2 ==0) {
				System.out.println("2�� ���");
				
			}	else if (num4 % 3 ==0) {
				System.out.println("3�� ���");
				
			}
			
			// ctrl + shift + f > ����
			
			int randomValue = (int) (Math.random() * 6) +1;
			//���������� �ٲٷ��� ���� double�� int������ �ٲ������
			// double randomValue = �̷��� �ϸ� �Ҽ����� ���� ����
			System.out.println(randomValue);
			
			//switch���ǹ� -> 1�� ���Խ��ϴ�.
			//4�� ��
			
			
			switch(randomValue) {
			case 1:
				System.out.println("1�� ���Խ��ϴ�.");
				break;
			case 2:
				System.out.println("2�� ���Խ��ϴ�.");
				break;
			case 3:
				System.out.println("3�� ���Խ��ϴ�.");
				break;
			case 4: 
				System.out.println("4�� ���Խ��ϴ�.");
				break;
			case 5:
				System.out.println("5�� ���Խ��ϴ�.");
				break;
			case 6:
				System.out.println("6�� ���Խ��ϴ�.");
	
			}
			
			System.out.println("4��° ��");
			
			
			//5������
			// int randomScore = 0; // 0~99�� ������ ���� ��������...
			// 90�� �̻��̸� A����, 80�� �̻��̸� B����, 70�� �̻��̸� C����
			// 60�� �̻��̸� D���� �װ� �ƴϸ� F����
			
			int randomValue5 = (int) (Math.random() * 100);
				System.out.println(randomValue5 + "���� ���Խ��ϴ�");
				
			if (randomValue5 >= 90) {
				System.out.println("A�����Դϴ�.");
			} else if (randomValue5 >=80) {
				System.out.println("B�����Դϴ�.");

			} else if (randomValue5 >=70) {
				System.out.println("C�����Դϴ�.");

			} else if (randomValue5 >=60) {
				System.out.println("D�����Դϴ�.");

			} else {
				System.out.println("F�����Դϴ�.");

			}
			
			int randomswitch = (int) (randomValue5/10);
			System.out.println(randomValue5 + "���� ���Խ��ϴ�");

			switch(randomswitch) {
			case 9:
				System.out.println("A�����Դϴ�.");
				break;
				
			case 8:
				System.out.println("B�����Դϴ�.");
				break;
			case 7:
				System.out.println("C�����Դϴ�.");
				break;
			case 6:
				System.out.println("D�����Դϴ�.");
				break;
			default:
				System.out.println("F�����Դϴ�.");

				System.out.println("5��° ��");

				
	}
			
	
}
	
}

	
		
		
		
		

