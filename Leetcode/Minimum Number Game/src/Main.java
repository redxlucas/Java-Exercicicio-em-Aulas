
public class Main {

	public static void main(String[] args) {

		Solution solution = new Solution();

		int array[] = { 4, 1, 3, 2 };

		array = solution.numberGame(array);

		System.out.print("[ ");

		for (int i : array) {
			System.out.print(i + " ");
		}

		System.out.print("]");

	}

}
