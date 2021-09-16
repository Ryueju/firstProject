package reference;

public class MethodExample2 {
	 public static void main(String[] args) {
		 sum(24,55); // 메소드 실행.
		 // sum (int n1, int n2);  < 이런식으로 하면 안됨, 값이들어와야함
		 int a  = 34, b = 77;
		 sum(a, b);
		 
		 int i1 = 14, i2 = 55;
		 multi(i1, i2);
		 
		 double s = 3.5;
		 getArea(s);
		 
		 // 변수에 값을 할당해주고 변수를 넣은 것임
		 
		 int res = getMax(a,b);
		 System.out.println("큰 수는 :" + res);
		 
		
		 int dvd = divide(a, b);
		 
		 
	 }
	 
	 // 두 정수를 입력받아서 두 수의 합을 console에 보여줘보자
	 //반환해주는 값은 없지만 입력결과를 보자.
	 
	 public static void sum(int n1, int n2) {
		 					//정수만 올 수 있다는 뜻
		 int sum = n1 + n2;
		 System.out.println("두 수의 합 : " + sum);
		 }
	 
	 // 두 정수를 입력받아서 두 수의 곱을 console에 보여줘보자
	 
	 public static void multi(int i1, int i2) {
		 int sum = i1 * i2;
		 System.out.println("두 수의 곱 : " + sum);
		 
	 }
	 
	 // 정사각형 너비를 계산해주는 메소드.
	 public static void getArea(double side) {
		 						//소숫점까지 받음
		 double sum = side * side;
		 System.out.println("정사각형의 너비는 : " + sum);
	 }
	 
	 //두 수 중에서 큰 값을 반환해주는 메소드
	 public static int getMax(int num1, int num2) {
		 int result = (num1 >= num2) ? num1 : num2;
		 return result;
	 }
	 // 두 정수를 입력받아서 첫번째 값 / 두번째 값 나눈 결과.
	 public static double divide(int a, int b) {
		 int result = (a / b);
		 return result;
		 System.out.pritnln("결과는 : " + divide(a/b) + "입니다.");
		 
	 }
		 
	 }

