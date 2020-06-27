
public class App {

	public static void main(String[] args) {

		// NUMBER ARRAY
		int[] firstArray = { 124, 45, 98 };

		int[][] grid = { { 3, 5, 2324 }, { 4, 5, 1209 }, { 1, 2, 4129 } };

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				// Add a tab
				System.out.print(grid[row][column] + "\t");
			}
			System.out.println();
		}

		// [row][column]
		System.out.println(grid[1][1]);

		// STRING ARRAY
		String[][] secondArray = new String[2][4];

		secondArray[0][0] = "Top left";

		System.out.println(secondArray[0][0]);

		// 2 rows, last one is empty. Each row null.
		String[][] words = new String[2][];

		// Will output null
		System.out.println(words[0]);

		words[0] = new String[3];

		// column is within previous array
		words[0][1] = "Ridita Nizam";

		System.out.println(words[0][1]);
	}

}
