package control;
// 0915
import java.util.Scanner;
import java.lang.String; //기본패키지라.. 따로설정안하고 생략해도됨


public class WhileExample2 {
 public static void main(String[] args) {
	 String name =  " 홍길동";
	 String age = "20";
	 String phone = "010-1234-5678";
	 
	 //사용자의 입력한 값을 읽어서Scanner 사용
	 // 사용자가 1누르면 이름 보여주기
	 // 사용자가 2누르면 나이 보여주기
	 // 사용자가 3누르면 연락처 보여주기
	 // 사용자가 4누르면 반복문 종료하기..
	 
	 Scanner scn = new Scanner(System.in);
	 while(true) {
		 System.out.println("메뉴를 선택하세요");
		 System.out.println("1.이름 2.나이 3.연락처 4.종료");
		 
		 int menu = scn.nextInt();
		 if(menu == 1) {
			 System.out.println("이름 : " + name);
			 } else if (menu == 2) {
			System.out.println("나이 : " + age);
			 } else if (menu == 3) {
		 System.out.println("연락처 : " + phone);
		 	 } else if (menu == 4) {
		 		 break;
		 	 }

	 }
	 System.out.println("끝.");

			 
	 
	 
 }
}
