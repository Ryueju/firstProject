
package control;

// 0915 do...while 연습하기
public class DoWhileExe {
	public static void main(String[] args) {
		boolean run = false;

		// 문제1.1부터 10까지 출력..하구..
		// 끝1.

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
		System.out.println("끝1");

		// 문제2. 짝수만 출력
		// 끝2
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
		System.out.println("끝2");

		// 문제3.홀수만 합계
		
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
	System.out.println("끝3");
	
	
	
	
	
	// 임의의 값을 1~10;
	// sum 값이 100보다 큰 수가 되었을 때
	// 그때의 sum 값을 출력, 몇번 실행했는지 보여줄 수 있도록
	// sum : 101, 실행 : 13
	// 끝4
	
//모름 ^ㅁ^	
	
	
}
	
}
