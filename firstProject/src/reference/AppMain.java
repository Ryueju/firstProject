package reference;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		// �л������� ������ �����м�

		// �л��ο� ����, �л�����, ��ü����Ʈ,
		// �м� : ���, �ְ���, ����
		int[] scores = null;

		while (true) {
			showMenu();

			int choice = readInt("��ȣ�� �����ϼ���>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];

			} else if (choice == 2) {
				inputValue(scores);

			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);
				

			} else if (choice == 5) {
				break;

			}

		}

	System.out.println("��.");

	}

	public static void showMenu() {
		System.out.println("1.�л��ο�, 2.�л�����, 3.��ü����Ʈ, 4. �м� : ���, �ְ���, 5. ����	");

	}

	public static int createStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ���.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if(ary == null) {
			System.out.println("���� �л� ���� �ӷ��ϼ���.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt((i + 1) + "�� ° �л� ������ �Է��ϼ���.");
		}

	}

	public static void showList(int[] ary) {
		if(ary == null);
		for (int i = 0; i < ary.length; i++) {
			// scores[0] =>88
			System.out.printf("scores[%d] => %d\n", i, ary[i]);
		}

	}

	public static void analysis(int[] ary) {
		//���, �ְ��� => �ܼ�
		//�ڵ屸��...
		double avg = 0;
		int maxVal = 0; int sum = 0;
		for(int score : ary) {
			sum += score;
			if(maxVal < score) {
				maxVal = score;
			}
		}
		avg = (double) sum / ary.length;
		
		System.out.printf("��� :%s, �ְ��� : %d\n" , avg, maxVal);
	}

	public static int readInt(String msg) {
		Scanner sc = new Scanner(System.in);
		 while(true) {
			 System.out.println(msg);
				 try {
					 int menu = sc.nextInt();
					 return menu;
					 
				 } catch(Exception e) {
					 System.out.println("���� �߸� �Է��߽��ϴ�.");
					 
				 }
		 }

	//	System.out.println(msg);
	//	int menu = sc.nextInt();
	//	return menu;

	}
}
