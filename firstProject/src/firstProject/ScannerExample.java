package firstProject;
import java.util.Scanner;

// firstProject.ScannerExample

public class ScannerExample {
	
	public static void main(String[] args) {
		
		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���...");
		String name = scn.nextLine();
		// lch Enter.
		System.out.println("���̸� �Է��ϼ���");
		int age = scn.nextInt(); // 20 Enter. ���ڸ� �����´�.
		scn.nextLine();
		
		
		System.out.println("��̸� �Է��ϼ���...");
		String hobby = scn.nextLine(); // lch Enter.
		
		System.out.println("[�Է��� ��]");
		System.out.printf("�̸�: %s, ����: %d, ���: %s" , name, age, hobby);
		
	}

}
