package reference;

public class MethodExample {
	 public static void main (String[] args) {
		 //�񸸵� ������
//		 double bmi = weight / (height * height);
//		 bmi < 18.5 ��ü��.
//		 18.5~ 23 ����.
//		 23 ~ 25 ��ü��.
//		 25 ~ 30 ��.
//		 30�̻��� ����
		 double w1 = 72.4, h1 = 1.75;
		 checkBMI (w1,h1); //�̰Ը޼ҵ��� //�޼ҵ带 ����
		 double w2 = 65.7, h2 = 163.4;
		 checkBMI (w2,h2);
		 checkBMI (65.8, 173.6);
		 
		 //�����Կ� Ű�� �޾Ƽ� ����� ��Ÿ���� ������ �ҼӵǸ� 
		 // ������ ������ ó���� �ϰ� ������ ��������
		 
// int w1, h1;
// int w2, h2;
// int w3, h3;
	 }
	 
	 //�޼ҵ带 �����Ҷ� 						//�Ű�����
	 public static void checkBMI (double weight, double height) {
		 double bmi = weight / (height * height);
		 if(bmi < 18.5) {
			 System.out.println("��ü��");
		 } else if(bmi >=18.5 && bmi < 23) {
			 System.out.println("����ü��");
			 
		 } else if(bmi >=23 && bmi <25 ) {
			 System.out.println("��ü��");
		 } else if(bmi >25 && bmi < 30) {
			 System.out.println("��");
		 } else {
			 System.out.println("�ǻ�� �����ϼ���");
		 }
		 
	 }
}
