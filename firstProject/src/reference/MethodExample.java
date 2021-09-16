package reference;

public class MethodExample {
	 public static void main (String[] args) {
		 //비만도 계산공식
//		 double bmi = weight / (height * height);
//		 bmi < 18.5 저체중.
//		 18.5~ 23 정상.
//		 23 ~ 25 과체중.
//		 25 ~ 30 비만.
//		 30이상은 고도비만
		 double w1 = 72.4, h1 = 1.75;
		 checkBMI (w1,h1); //이게메소드임 //메소드를 실행
		 double w2 = 65.7, h2 = 163.4;
		 checkBMI (w2,h2);
		 checkBMI (65.8, 173.6);
		 
		 //몸무게와 키를 받아서 결과를 나타내고 범위에 소속되면 
		 // 값들을 만들어내는 처리를 하고 판정을 내려보자
		 
// int w1, h1;
// int w2, h2;
// int w3, h3;
	 }
	 
	 //메소드를 정의할때 						//매개변수
	 public static void checkBMI (double weight, double height) {
		 double bmi = weight / (height * height);
		 if(bmi < 18.5) {
			 System.out.println("저체중");
		 } else if(bmi >=18.5 && bmi < 23) {
			 System.out.println("적정체중");
			 
		 } else if(bmi >=23 && bmi <25 ) {
			 System.out.println("과체중");
		 } else if(bmi >25 && bmi < 30) {
			 System.out.println("비만");
		 } else {
			 System.out.println("의사와 상의하세요");
		 }
		 
	 }
}
