package operator;
// ������ 0915
public class OperatorExample {
	public static void main(String[] args) {
		
		// +, -, *, /, %,  ( &, |, ^, ~)
		// �����ڴ� �⺻������ intŸ������ ..
		int num1, num2, result;
		// ������ ������ ǥ���� �� , �� ǥ��
		
		num1 = 10;
		num2 = 5;
		
		result = num2 = num1;
		// num1�� ���� num2�� �ְ� num2�� ���� result�� ��ڴٴ� ��
		result = num1 * num2;
		// ���׿�����
		// ������ �� 3�� �ְ�, =�� �Ҵ�(����)�����ڶ�� �� 
		// ������ �κ��� ó���ؼ� ���ʿ� ��ڽ��ϴ�
		
		
		// num1 * num2 = result;
		result = -result;
		// ���׿����� 
		System.out.printf("-������: %d\n", result);
		
		
		
		result = num1 % 3;
		// % : num1�� 3���� ���� ������
		System.out.printf("������: %d\n", result);
		// \n�� �ٹٲ�
		
		
		result = num1 & num2;
		System.out.printf("& ������: %d\n", result);
		
		result = num1 | num2;
		System.out.printf("| ������: %d\n", result);
		
		result = num1 ^ num2;
		System.out.printf("^ ������: %d\n", result);
		
		result = ~num1; // 2���� => ~ + 1 = 0
		// ������Ų���� 1�� ���ؼ� 0�� �Ǹ� ..?
		// 3 + (-3) = 0 
		System.out.printf("~ ������: %d\n", result);
		// ��Ʈ�� ������Ű�� ������
	
		
		
		
		// >>, >>>, << (��Ʈ������)
		result = num1 >> 2;
		System.out.printf(">> ������: %d\n", result);

		// ��������  &&, ||, !
		boolean b1 = false;
		boolean b2 = !b1;
		//���Ǵ� �������� ������ ������ �������� booleanŸ���̶����
		//b1���� ����ִ� ���� �ݴ븦 ���ϰڴٴ� ��.
		boolean b3 = b1 || b2;
		// b1�� ���� b2�� ���� ��� ���̸� ���̰�, �ΰ��� �ϳ��� false���
		//false�� ������ڴٴ� ��.
		System.out.printf("b3 : %s, b1: %s, b2: %s", b3, b1, b2);
		
	}
}
