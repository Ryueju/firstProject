package reference;

import java.util.Scanner;

public class Ryueju0916 {
	// Ŭ���� �̸� �ٲٱ� �Ҷ� F2������ �� �ٲ��ֱ�

	// 1.�л��� ���� 2.�л��̸� �Է� 3.��� 4.����
	// String[] names = null;

	// ȸ�� ��ȸ�ϱ�~..(??;;)

	public static void main(String[] args) {

		String[] meb = null;
		while (true) {
			showMenu();
			int choicenum = readint("��ȣ�� �����ϼ���>>>");
			if (choicenum == 1) {
				int size = createMember();
				meb = new String[size];
			} else if (choicenum == 2) {
				inputValue(meb);

			} else if (choicenum == 3) {
				showList(meb);

			} else if (choicenum == 4) {
				break;
			}

		}
		System.out.println(" �� !!!!!! ");

	}

	public static void showMenu() {
		System.out.println("1.��ȸ�� ȸ���� ����Դϱ�? 2.ȸ�� �̸��� �����Դϱ�? 3. ��ȸ�� ȸ�� ����Ʈ 4. ����");
	}

	public static int createMember() {
		int cnt = readint("��ȸ�� ȸ�� ���� �Է��ϼ���.");
		return cnt;

	}

	public static void inputValue(String[] ary) {
		if (ary == null) {
			System.out.println(" ȸ�� ���� ���� �Է��ϼ���.");
			return;

		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readString(" ȸ�� �̸��� �Է��ϼ���.");
		}

	}

	public static void showList(String[] ary) {
		if (ary == null) {
			System.out.println(" ȸ������ ���� �Է��ϼ���.");
			return;

		}
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%dȸ���� %s \n", i, ary[i]);
		}

	}

	public static String readString(String msg) {
		Scanner snc = new Scanner(System.in);
		System.out.println(msg);
		String menu = snc.nextLine();
		return menu;
	}

	public static int readint(String msg) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(msg);
			try {
				int menu = sc.nextInt();
				return menu;

			} catch (Exception e) {
				System.out.println("���� �߸� �Է��߽��ϴ�.");

			}
		}
	}
}
