package firstProject;

import java.util.Scanner;

//이름을 입력하세요
//1과목점수를 입력하세요
//2과목점수를 입력하세요
//3과목점수를 입력하세요
// 000님의 시험점수의 합계는 00점, 평균은 00점 입니다.
// 평균점수가 60점 이상이면 합격/ 59점 이하면 불합격
//실기시험 (불)합격입니다.



public class Ejuryu {
	
	public static void main(String[] args) {
		
		System.out.println("정보처리기사 실기시험 합격 예측 조회");
		
		
		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		
		System.out.println("수험번호를 입력하세요");
		int num = scn.nextInt();
		scn.nextLine();
	
		System.out.println("1과목 점수를 입력하세요");
		int num1 = scn.nextInt();
		
		System.out.println("2과목 점수를 입력하세요");
		int num2 = scn.nextInt();
		
		System.out.println("3과목 점수를 입력하세요");
		int num3 = scn.nextInt();
		
		int sum = num1 + num2 + num3;
		int avg = (num1 + num2 + num3) / 3;
		
		System.out.println(name + "님의 1,2,3과목 점수의 합은" + sum + "점, 평균은 " + avg +"점 입니다.");
		
		if(avg>=60) {
			System.out.println(name + "님은 합격입니다. ><* ");
		} else { 
			System.out.println(name + "님은 불합격입니다. ㅠㅠ");
			
		}
	
				
		
		
	}

}
