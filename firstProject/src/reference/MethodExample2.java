package reference;

public class MethodExample2 {
	 public static void main(String[] args) {
		 sum(24,55); // �޼ҵ� ����.
		 // sum (int n1, int n2);  < �̷������� �ϸ� �ȵ�, ���̵��;���
		 int a  = 34, b = 77;
		 sum(a, b);
		 
		 int i1 = 14, i2 = 55;
		 multi(i1, i2);
		 
		 double s = 3.5;
		 getArea(s);
		 
		 // ������ ���� �Ҵ����ְ� ������ ���� ����
		 
		 int res = getMax(a,b);
		 System.out.println("ū ���� :" + res);
		 
		
		 int dvd = divide(a, b);
		 
		 
	 }
	 
	 // �� ������ �Է¹޾Ƽ� �� ���� ���� console�� �����ຸ��
	 //��ȯ���ִ� ���� ������ �Է°���� ����.
	 
	 public static void sum(int n1, int n2) {
		 					//������ �� �� �ִٴ� ��
		 int sum = n1 + n2;
		 System.out.println("�� ���� �� : " + sum);
		 }
	 
	 // �� ������ �Է¹޾Ƽ� �� ���� ���� console�� �����ຸ��
	 
	 public static void multi(int i1, int i2) {
		 int sum = i1 * i2;
		 System.out.println("�� ���� �� : " + sum);
		 
	 }
	 
	 // ���簢�� �ʺ� ������ִ� �޼ҵ�.
	 public static void getArea(double side) {
		 						//�Ҽ������� ����
		 double sum = side * side;
		 System.out.println("���簢���� �ʺ�� : " + sum);
	 }
	 
	 //�� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�
	 public static int getMax(int num1, int num2) {
		 int result = (num1 >= num2) ? num1 : num2;
		 return result;
	 }
	 // �� ������ �Է¹޾Ƽ� ù��° �� / �ι�° �� ���� ���.
	 public static double divide(int a, int b) {
		 int result = (a / b);
		 return result;
		 System.out.pritnln("����� : " + divide(a/b) + "�Դϴ�.");
		 
	 }
		 
	 }

