package control;

import java.util.Scanner;

public class Ryueju {
	public static void main(String[] args) {
		// if / for(while) break, continue ����ؼ�
		// �����غ���... -> �ڵ��........
		// ���� ������ ����.. while �̶�..continue,break ����
		// cnt�ؼ� ������� ������� ������ֱ�
		
		int num = (int)(Math.random() * 99) +1;
		int cnt = 0;
		
		System.out.println("�������ڰ���");
		System.out.println("���� ������ ���ڸ� ���߼���");
		
		while(true) {
			Scanner scn = new Scanner(System.in);
			cnt++;
			
			int num2 = scn.nextInt();
			if(num2 == num) {
				System.out.println("����!");
				break;
				
			} else if (num2 > num) {
				System.out.println("�� ���� ���ڸ� ���غ�����");
				continue;
				
			} else if (num2 < num) {
				System.out.println("�� ū ���ڸ� ���غ�����");
				continue;
				
			}
		}
		System.out.println(" ������ .." + num);
		System.out.println("�����մϴ�.!" + cnt + " �� ���� �����̳׿�!");
		
	}
}
