package control;

import java.util.Scanner;

public class ConditionExe {
	
	public static void main(String[] args) {
		// 두 정수 60, 70
		// 두 수를 합한 결과가 100점이 넘어서면 합격, 불합격
		// 끝. < 출력하기
		
		// 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수.
		// 두번 째 끝.
		
		int score = 60;
		int score2 = 70;
		
		if (score + score2 > 100) {
			System.out.println("합격");
			
		} else {
			System.out.println("불합격");
			
		}
		
		System.out.println("끝.");
		
		// 두 수를 곱해서 짝수이면 짝수, 홀수이면 홀수.
		// 두번 째 끝.
		
		int num1,num2; 
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scn.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		num2 = scn.nextInt();
		
		int result = num1 * num2;
		
		if(result % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
			System.out.println("두번째 끝");
			
		
		// 복합 대입 연산자
		// 4의 값.
		// 2의 배수이면 2의 배수, 3의 배수이면 3의 배수, 2와 3의 배수
		
			int num4 = 15;
			
			if (num4 % 2 == 0 && num4 % 3 == 0) {
				System.out.println("2의 배수");
			} 	else if (num4 % 2 ==0) {
				System.out.println("2의 배수");
				
			}	else if (num4 % 3 ==0) {
				System.out.println("3의 배수");
				
			}
			
			// ctrl + shift + f > 정리
			
			int randomValue = (int) (Math.random() * 6) +1;
			//정수값으로 바꾸려면 앞의 double을 int값으로 바꿔줘야함
			// double randomValue = 이렇게 하면 소수점도 같이 나옴
			System.out.println(randomValue);
			
			//switch조건문 -> 1이 나왔습니다.
			//4번 끝
			
			
			switch(randomValue) {
			case 1:
				System.out.println("1이 나왔습니다.");
				break;
			case 2:
				System.out.println("2가 나왔습니다.");
				break;
			case 3:
				System.out.println("3이 나왔습니다.");
				break;
			case 4: 
				System.out.println("4가 나왔습니다.");
				break;
			case 5:
				System.out.println("5가 나왔습니다.");
				break;
			case 6:
				System.out.println("6이 나왔습니다.");
	
			}
			
			System.out.println("4번째 끝");
			
			
			//5번문제
			// int randomScore = 0; // 0~99점 임의의 값이 나오도록...
			// 90점 이상이면 A학점, 80점 이상이면 B학점, 70점 이상이면 C학점
			// 60점 이상이면 D학점 그게 아니면 F학점
			
			int randomValue5 = (int) (Math.random() * 100);
				System.out.println(randomValue5 + "점이 나왔습니다");
				
			if (randomValue5 >= 90) {
				System.out.println("A학점입니다.");
			} else if (randomValue5 >=80) {
				System.out.println("B학점입니다.");

			} else if (randomValue5 >=70) {
				System.out.println("C학점입니다.");

			} else if (randomValue5 >=60) {
				System.out.println("D학점입니다.");

			} else {
				System.out.println("F학점입니다.");

			}
			
			int randomswitch = (int) (randomValue5/10);
			System.out.println(randomValue5 + "점이 나왔습니다");

			switch(randomswitch) {
			case 9:
				System.out.println("A학점입니다.");
				break;
				
			case 8:
				System.out.println("B학점입니다.");
				break;
			case 7:
				System.out.println("C학점입니다.");
				break;
			case 6:
				System.out.println("D학점입니다.");
				break;
			default:
				System.out.println("F학점입니다.");

				System.out.println("5번째 끝");

				
	}
			
	
}
	
}

	
		
		
		
		

