package control;

public class WhileExample {
	public static void main(String[] args) {
		int i =1; //�ʱ��
		while(i <= 10) {
			System.out.printf("i�� ���� %d \n", i);
			i++;		
		}
		//while������� �����ϴ� ���� ������ ������ �����ϰڽ��ϴ�.
		boolean run = true;
		int cnt = 0;
		while(run) {
			//run���� ���̶�� ~�� �����ϰڴ�
			cnt = (int) (Math.random() * 10) +1;
			System.out.println(cnt);
			//8�� ���ö����� ������
			if(cnt == 8) {
				run = false;
				//8�̶�� ���� ������ run�� false�� ����ϼ���
				break;//�ݺ����� �����ϰڴٴ� ��
			}
		}
		System.out.println("��.");
		
		
		
		
	}
}
