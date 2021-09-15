package control;

//0915 switch구문
public class ControlExample2 {
	public static void main(String[] args) {
		String inputValue = "D";
		
		switch(inputValue) {
		case "A":
			System.out.println("참 잘했습니다!");
			break; //각각의 경우만 보여주고 빠져나오도록해줌
			
		case "B":
			System.out.println("잘했습니다!");
			break;
			
		case "C":
			System.out.println("보통입니다");
			break;
			
		case "D":
			System.out.println("노력하세용");
			break;
			
		default :
			System.out.println("실망입니다.....");
		
		}
		
		//
		switch(inputValue) {
		case "A":
		case "B":
		case "C":

			System.out.println("Pass");
			break;
		case "D":
			System.out.println("Retry");
			break;
		default:	
			System.out.println("Fail");

		}
	}
}
