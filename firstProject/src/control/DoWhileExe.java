
package control;

// 0915 do...while �����ϱ�
public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;

		// ����1.1���� 10���� ���..�ϱ�..
		// ��1.

		int cnt = 0;

		do {

			if (cnt <= 10) {
				cnt++;
			}
			System.out.println(cnt);

			if (cnt >= 10) {
				break;
			}

		}

		while (true);
		System.out.println("��1");

		// ����2. ¦���� ���
		// ��2
		int num1 = 0;
		run = true;
		do {
			num1++;
			if (num1 % 2 == 1) {

				continue;
			}
			System.out.println(num1);

			if (num1 >= 10) {
				break;

			}

		} while (run);
		System.out.println("��2");

		// ����3.Ȧ���� �հ�
		
		cnt = 0;	 
		int sum = 0;
		
		do {
			cnt++;
			if(cnt % 2 == 0) {
				continue;
				
			}
			if(cnt >= 10) {
				break;
			}
			sum += cnt;
		}
	 while(true);
	System.out.println(sum += cnt);
	System.out.println("��3");
	
	
	
	
	
	// ������ ���� 1~10;
	// sum ���� 100���� ū ���� �Ǿ��� ��
	// �׶��� sum ���� ���, ��� �����ߴ��� ������ �� �ֵ���
	// sum : 101, ���� : 13
	// ��4
	
//�� ^��^	
	
	
}
	
}
