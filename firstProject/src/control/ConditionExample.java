package control;

//0915 if 구문과 switch 구문

public class ConditionExample {
	public static void main(String[] args) {
		int score = 90;
		
		if(score >= 60) {
			System.out.println("합격입니다");
					
	} else {
		System.out.println("불합격입니다");
	}
		
		
	// 90 이상이면 A,80 이상이면 B, 70이상이면 C, 60이상이면 D,
	// 그 외 F
		
	if(score >= 90) {
		System.out.println("A학점");
	} else if (score >= 80) {
		System.out.println("B학점");

	} else if (score >=70) {
		System.out.println("C학점");
	} else if (score >=60) {
		System.out.println("D학점");
	} else  {
		System.out.println("F학점");

	}
		
		
		
		System.out.println("끝.");
		
}
	
}
