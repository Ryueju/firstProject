package control;

public class DoWhileExample {
 public static void main(String[] args) {
	 
	 //Do...While
	boolean run = false; //현재 run이라는 변수가 false 임
//	while(run) { //run이 true이면 실행함
//		System.out.println("실행문1");
//	}
	 
	
	int cnt = 0;
	
	do {
		cnt++;
		if(cnt % 2 == 1) {
			continue; //cnt값이 짝수면, 그냥 다음 순번으로 그냥 넘어감
		}
		System.out.println(cnt);
		if(cnt >= 4) {
			break;
		} 
		
//		System.out.println("실행문2");

	 } while(true);
	 System.out.println("끝.");
	 
 }
}
