package reference;

public class MathodExample4 {
	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		int maxVal = 0;
		boolean isTrue = maxVal > scores[0];
		if (!isTrue) {
			maxVal = scores[0];
		}

		System.out.println(maxVal);
		isTrue = maxVal < scores[1];

		System.out.println("끝1.");

		int[] anotherAry = { 55, 82, 34, 19, 47, 89 };

	}

	public static int getMaxValue(int[] ary) {
		//최댓값 구하기.
		int maxVal = 0;
		boolean isTrue = false;
		
		for (int i = 0; 1 < ary.length; i++) {
			isTrue = maxVal < ary[i];
			if(isTrue) {
				maxVal = ary[i];
			}
		}
		return maxVal;
		
	}

}
