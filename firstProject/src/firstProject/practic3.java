package firstProject;

import java.util.Scanner;

// ���������Է�:
// ���������Է�:
// �̸��Է�:
// 000���� ����,���������� ���� ? , ����� ? �Դϴ�.
//printf �޼ҵ带 ������.. ��...

//����� 90 �̻��̸�, �հ�.
//000���� (��)�հ��Դϴ�...

public class practic3 {

	 public static void main(String[] args) {
	
		
		 java.util.Scanner scn = new Scanner(System.in);
		 System.out.println("���������� �Է��ϼ���");
		 int y1 = scn.nextInt();
		 
		 System.out.println("���������� �Է��ϼ���");
		 int m1 = scn.nextInt();
		 scn.nextLine();
		 
		 String name = "������";
		 
		 int g1 = y1 + m1;
		 int g2  = g1 / 2;
		 
		 System.out.println(name + "���� ����, ���������� ���� " + g1 + "," + "����� " + g2 + " �Դϴ�.");
		 System.out.printf("�̸�: %s, ")
		 
		 if(g2>=90) {
			 System.out.println(name + "���� �հ��Դϴ�");
		 } else {
			 System.out.println(name + "���� ���հ��Դϴ�");
		 }
		 
		 }
				 
	 }

