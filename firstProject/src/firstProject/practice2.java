package firstProject;

import java.util.Scanner;

// 변수 : 사용자 입력 (10, 20 ) 
// 10 + 20 = 30

public class practice2 {

	public static void main(String[] args) {
		
		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력하세요");
		int name = scn.nextInt();
		
		System.out.println("두번째 값을 입력하세요");
		int num = scn.nextInt();
		scn.nextLine();
		
		int b1 = name + num;
		
		System.out.println(name + "+"+num + "=" + b1);
		
		
		
		
	
	}
}
