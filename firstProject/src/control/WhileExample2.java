package control;
// 0915
import java.util.Scanner;
import java.lang.String; //�⺻��Ű����.. ���μ������ϰ� �����ص���


public class WhileExample2 {
 public static void main(String[] args) {
	 String name =  " ȫ�浿";
	 String age = "20";
	 String phone = "010-1234-5678";
	 
	 //������� �Է��� ���� �оScanner ���
	 // ����ڰ� 1������ �̸� �����ֱ�
	 // ����ڰ� 2������ ���� �����ֱ�
	 // ����ڰ� 3������ ����ó �����ֱ�
	 // ����ڰ� 4������ �ݺ��� �����ϱ�..
	 
	 Scanner scn = new Scanner(System.in);
	 while(true) {
		 System.out.println("�޴��� �����ϼ���");
		 System.out.println("1.�̸� 2.���� 3.����ó 4.����");
		 
		 int menu = scn.nextInt();
		 if(menu == 1) {
			 System.out.println("�̸� : " + name);
			 } else if (menu == 2) {
			System.out.println("���� : " + age);
			 } else if (menu == 3) {
		 System.out.println("����ó : " + phone);
		 	 } else if (menu == 4) {
		 		 break;
		 	 }

	 }
	 System.out.println("��.");

			 
	 
	 
 }
}