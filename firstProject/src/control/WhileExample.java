package control;

public class WhileExample {
	public static void main(String[] args) {
		int i =1; //초기식
		while(i <= 10) {
			System.out.printf("i의 값은 %d \n", i);
			i++;		
		}
		//while어떤조건을 만족하는 값이 나오면 구문을 종료하겠습니다.
		boolean run = true;
		int cnt = 0;
		while(run) {
			//run값이 참이라면 ~을 실행하겠다
			cnt = (int) (Math.random() * 10) +1;
			System.out.println(cnt);
			//8이 나올때가지 실행함
			if(cnt == 8) {
				run = false;
				//8이라는 값이 나오면 run에 false를 출력하세요
				break;//반복문을 종료하겠다는 뜻
			}
		}
		System.out.println("끝.");
		
		
		
		
	}
}
