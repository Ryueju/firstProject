package firstProject;

import java.util.Scanner;

// 영어점수입력:
// 수학점수입력:
// 이름입력:
// 000님의 영어,수학점수의 합은 ? , 평균은 ? 입니다.
//printf 메소드를 쓰세요.. 네...

//평균이 90 이상이면, 합격.
//000님은 (불)합격입니다...

public class practic3 {

	 public static void main(String[] args) {
	
		
		 java.util.Scanner scn = new Scanner(System.in);
		 System.out.println("영어점수를 입력하세요");
		 int y1 = scn.nextInt();
		 
		 System.out.println("수학점수를 입력하세요");
		 int m1 = scn.nextInt();
		 scn.nextLine();
		 
		 String name = "류이주";
		 
		 int g1 = y1 + m1;
		 int g2  = g1 / 2;
		 
		 System.out.println(name + "님의 영어, 수학점수의 합은 " + g1 + "," + "평균은 " + g2 + " 입니다.");
		 System.out.printf("이름: %s, ")
		 
		 if(g2>=90) {
			 System.out.println(name + "님은 합격입니다");
		 } else {
			 System.out.println(name + "님은 불합격입니다");
		 }
		 
		 }
				 
	 }

