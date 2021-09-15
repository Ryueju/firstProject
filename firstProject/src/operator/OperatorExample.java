package operator;
// 연산자 0915
public class OperatorExample {
	public static void main(String[] args) {
		
		// +, -, *, /, %,  ( &, |, ^, ~)
		// 연산자는 기본적으로 int타입으로 ..
		int num1, num2, result;
		// 변수를 여러개 표현할 때 , 로 표현
		
		num1 = 10;
		num2 = 5;
		
		result = num2 = num1;
		// num1의 값을 num2에 넣고 num2의 값을 result에 담겠다는 뜻
		result = num1 * num2;
		// 이항연산자
		// 변수가 총 3개 있고, =는 할당(대입)연산자라고 함 
		// 오른쪽 부분을 처리해서 왼쪽에 담겠습니당
		
		
		// num1 * num2 = result;
		result = -result;
		// 단항연산자 
		System.out.printf("-연산결과: %d\n", result);
		
		
		
		result = num1 % 3;
		// % : num1을 3으로 나눈 나머지
		System.out.printf("연산결과: %d\n", result);
		// \n은 줄바꿈
		
		
		result = num1 & num2;
		System.out.printf("& 연산결과: %d\n", result);
		
		result = num1 | num2;
		System.out.printf("| 연산결과: %d\n", result);
		
		result = num1 ^ num2;
		System.out.printf("^ 연산결과: %d\n", result);
		
		result = ~num1; // 2진수 => ~ + 1 = 0
		// 반전시킨수에 1을 더해서 0이 되면 ..?
		// 3 + (-3) = 0 
		System.out.printf("~ 연산결과: %d\n", result);
		// 비트를 반전시키는 연산자
	
		
		
		
		// >>, >>>, << (비트연산자)
		result = num1 >> 2;
		System.out.printf(">> 연산결과: %d\n", result);

		// 논리연산자  &&, ||, !
		boolean b1 = false;
		boolean b2 = !b1;
		//참또는 거짓값을 가지는 값들을 논리연산자 boolean타입이라고함
		//b1원에 들어있는 값의 반대를 취하겠다는 뜻.
		boolean b3 = b1 || b2;
		// b1의 값과 b2의 값이 모두 참이면 참이고, 두개중 하나라도 false라면
		//false를 갖고오겠다는 뜻.
		System.out.printf("b3 : %s, b1: %s, b2: %s", b3, b1, b2);
		
	}
}
