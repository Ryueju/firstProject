package control;

public class ForTimesExample {
	public static void main(String[] agrs) {
	
	for (int j=2; j<=9; j++) {	
		
	int row = j; //2�� ���� 9��, 3�� ���� 9�� ....���� 9�� �ݺ���
	System.out.println("===" + row + "��===");
	for (int i = 1; i <=9; i++) {
		System.out.printf("%d * %d = %d \n" , row, i, (row * i ));
		
	  }
	}
	}
}
