package firstProject;

import java.util.Scanner;

//�̸��� �Է��ϼ���
//1���������� �Է��ϼ���
//2���������� �Է��ϼ���
//3���������� �Է��ϼ���
// 000���� ���������� �հ�� 00��, ����� 00�� �Դϴ�.
// ��������� 60�� �̻��̸� �հ�/ 59�� ���ϸ� ���հ�
//�Ǳ���� (��)�հ��Դϴ�.



public class Ejuryu {
	
	public static void main(String[] args) {
		
		System.out.println("����ó����� �Ǳ���� �հ� ���� ��ȸ");
		
		
		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scn.nextLine();
		
		System.out.println("�����ȣ�� �Է��ϼ���");
		int num = scn.nextInt();
		scn.nextLine();
	
		System.out.println("1���� ������ �Է��ϼ���");
		int num1 = scn.nextInt();
		
		System.out.println("2���� ������ �Է��ϼ���");
		int num2 = scn.nextInt();
		
		System.out.println("3���� ������ �Է��ϼ���");
		int num3 = scn.nextInt();
		
		int sum = num1 + num2 + num3;
		int avg = (num1 + num2 + num3) / 3;
		
		System.out.println(name + "���� 1,2,3���� ������ ����" + sum + "��, ����� " + avg +"�� �Դϴ�.");
		
		if(avg>=60) {
			System.out.println(name + "���� �հ��Դϴ�. ><* ");
		} else { 
			System.out.println(name + "���� ���հ��Դϴ�. �Ф�");
			
		}
	
				
		
		
	}

}
