
public class PoolPuzzleOne {

	public static void main(String[] args) {
		int x = 0;
		while (x < 1) {
			System.out.print("a ");
			if ( x < 1) {
				System.out.println("noise");
			}
			x = x + 2;
			if (x > 1) {
				System.out.print("annoys");
				x = x - 1;
			}
			if (x == 1) {
				System.out.println(" ");
			}
			x = x + 1;
			if ( x > 0) {
				System.out.print("an");
			}
			System.out.print(" ");
			System.out.println("oyster");
		}

	}

}
