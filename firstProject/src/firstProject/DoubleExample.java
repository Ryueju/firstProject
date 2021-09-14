package firstProject;

public class DoubleExample {
	public static void main(String[] args) {
	// double(8byte), float(4byte)
	double d1 = 3.1;
	double d2 = 6.9;
	
	float f1 = 3.2F;
	
	double r1 = d1 + d2;
	System.out.println(Double.MAX_VALUE);
	
	d1 = d2 = 2.3;
	// 오른쪽에 있는 값을 왼쪽으로 하나씩 할당하라는 뜻임,,,,,
	
	boolean isSame = d1 == d2;
	// == 같니? 라는 뜻..

	System.out.println(isSame);
	
	String s1 = "Hello";
	String s2 = new String("Hello");
	// new???? s1이랑 s2에 있는 문자열을 비교할게..
	
	isSame = s1.equals(s2);
	// s1과 s2가 같습니까? 라는뜻
	System.out.println(isSame);
	
	
}
}