package control;

public class DoWhileExample {
 public static void main(String[] args) {
	 
	 //Do...While
	boolean run = false; //���� run�̶�� ������ false ��
//	while(run) { //run�� true�̸� ������
//		System.out.println("���๮1");
//	}
	 
	
	int cnt = 0;
	
	do {
		cnt++;
		if(cnt % 2 == 1) {
			continue; //cnt���� ¦����, �׳� ���� �������� �׳� �Ѿ
		}
		System.out.println(cnt);
		if(cnt >= 4) {
			break;
		} 
		
//		System.out.println("���๮2");

	 } while(true);
	 System.out.println("��.");
	 
 }
}
