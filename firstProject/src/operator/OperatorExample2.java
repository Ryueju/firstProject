package operator;
//0915 
public class OperatorExample2 {
	public static void main(String[] args) {
		// ����(�Ҵ�)������
		//�����ʿ� �ִ� ���� 
		int num1, num2, result;
		//���������ҰԿ�
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;
		//�ٽ� 10�� �� ���ϰڴ�
		//�Ȱ���. ���� ����ִ� �����ٰ� 10�� ���� ���� result�� ��ڴٴ� ��
		
		result -= 10;		//result = result - 10;
		result *= 10;		//result = result * 10;
		result /= 10;		//result = result / 10;		
		result %= 10; 		//result = result % 10;

		String str = "Hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);
		
		// 3�� ������
		int score = 80;
		boolean pass = (score > 60) ? true : false;
		// score�� 60���� ũ�� true, �׷��� ������ false�� �����Ұ�
		
		//�����ϸ� Pass , �ƴϸ� Fail
		
		
		
	}
}
