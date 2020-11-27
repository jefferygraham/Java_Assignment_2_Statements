
public class Assignment11 {

	public static void main(String[] args) {

		int[] intArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(intArr[i] + " * " + j + " = " + intArr[i] * j);
			}
		}

	}

}
