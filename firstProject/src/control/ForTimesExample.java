package control;

public class ForTimesExample {
	public static void main(String[] agrs) {
	
	for (int j=2; j<=9; j++) {	
		
	int row = j; //2의 값을 9번, 3의 값을 9번 ....각각 9번 반복됨
	System.out.println("===" + row + "단===");
	for (int i = 1; i <=9; i++) {
		System.out.printf("%d * %d = %d \n" , row, i, (row * i ));
		
	  }
	}
	}
}
