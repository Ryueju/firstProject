package control;

import java.util.Scanner;

public class Ryueju {
	public static void main(String[] args) {
		// if / for(while) break, continue 사용해서
		// 생각해보고... -> 코드로........
		// 숫자 스무고개 이제.. while 이랑..continue,break 쓰기
		// cnt해서 몇번만에 맞췄는지 출력해주기
		
		int num = (int)(Math.random() * 99) +1;
		int cnt = 0;
		
		System.out.println("랜덤숫자게임");
		System.out.println("제가 생각한 숫자를 맞추세요");
		
		while(true) {
			Scanner scn = new Scanner(System.in);
			cnt++;
			
			int num2 = scn.nextInt();
			if(num2 == num) {
				System.out.println("정답!");
				break;
				
			} else if (num2 > num) {
				System.out.println("더 작은 숫자를 말해보세요");
				continue;
				
			} else if (num2 < num) {
				System.out.println("더 큰 숫자를 말해보세요");
				continue;
				
			}
		}
		System.out.println(" 정답은 .." + num);
		System.out.println("축하합니다.!" + cnt + " 번 만에 맞히셨네요!");
		
	}
}
