package control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;
		
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);
		
		cnt += 1;
		System.out.printf("cnt : %d\n", cnt);
		
		System.out.println("=====다시=====");
		
		//for 구문 이렇게 반복되는걸 제어하는 것 = 반복문

		cnt = 0;
		for (int i = 1; i <= 5; i++) { //i=i+1 => i+=1
			cnt += i;
			System.out.printf("i %s, cnt: %d\n", i, cnt);		
		}
			System.out.println("반복문 끝.");
			
			
	 
			
			
			System.out.println("=====다시2=====");
			
			//for 구문 이렇게 반복되는걸 제어하는 것 = 반복문

			int tempValue = 0;

			for (int i = 1; i <= 10; i++) { //i=i+1 => i+=1
				tempValue = 0;
				tempValue += (int)(Math.random() * 10) + 1;
				System.out.printf("%d번째 값 : %d \n", i, tempValue);
			}
				
			System.out.println("sum:" + tempValue);
			System.out.println("반복문 끝.");
					
			
			
			
			System.out.println("=====다시2=====");
			//
			
		
			
			
			
			
			
	}
}
