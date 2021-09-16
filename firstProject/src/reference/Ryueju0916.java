package reference;

import java.util.Scanner;

public class Ryueju0916 {
	// 클래스 이름 바꾸기 할땐 F2누르고 다 바꿔주기

	// 1.학생수 지정 2.학생이름 입력 3.출력 4.종료
	// String[] names = null;

	// 회원 조회하기~..(??;;)

	public static void main(String[] args) {

		String[] meb = null;
		while (true) {
			showMenu();
			int choicenum = readint("번호를 선택하세요>>>");
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
		System.out.println(" 끝 !!!!!! ");

	}

	public static void showMenu() {
		System.out.println("1.조회할 회원은 몇명입니까? 2.회원 이름은 무엇입니까? 3. 조회한 회원 리스트 4. 종료");
	}

	public static int createMember() {
		int cnt = readint("조회할 회원 수를 입력하세요.");
		return cnt;

	}

	public static void inputValue(String[] ary) {
		if (ary == null) {
			System.out.println(" 회원 수를 먼저 입력하세요.");
			return;

		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readString(" 회원 이름을 입력하세요.");
		}

	}

	public static void showList(String[] ary) {
		if (ary == null) {
			System.out.println(" 회원수를 먼저 입력하세요.");
			return;

		}
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%d회원은 %s \n", i, ary[i]);
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
				System.out.println("값을 잘못 입력했습니다.");

			}
		}
	}
}
