
public class MultiDimensionArrays {

	public static void main(String[] args) {

		// Let's output an array matrix
		// its always [row][column]
		int[][] multiArray = { { 3, 4, 5, 6 }, { 100, 99, 98, 97 }, { 5, 10, 15, 20, 25, 30 }, { 10, 9, 8, 7, 6 } };

		System.out.println(multiArray[2][1] + multiArray[0][2]);

		for (int row = 0; row < multiArray.length; row++) {
			for (int col = 0; col < multiArray[row].length; col++) {
				System.out.print(multiArray[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
