package operator;
//0915 
public class OperatorExample2 {
	public static void main(String[] args) {
		// 대입(할당)연산자
		//오른쪽에 있는 값을 
		int num1, num2, result;
		//변수선언할게용
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;
		//다시 10을 더 더하겠다
		//똑같음. 원래 들어있던 값에다가 10을 더한 값을 result에 담겠다는 뜻
		
		result -= 10;		//result = result - 10;
		result *= 10;		//result = result * 10;
		result /= 10;		//result = result / 10;		
		result %= 10; 		//result = result % 10;

		String str = "Hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);
		
		// 3항 연산자
		int score = 80;
		boolean pass = (score > 60) ? true : false;
		// score가 60보다 크면 true, 그렇지 않으면 false를 리턴할게
		
		//만족하면 Pass , 아니면 Fail
		
		
		
	}
}
