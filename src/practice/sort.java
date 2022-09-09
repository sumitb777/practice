package practice;
import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int a[] = { 21, 65, 87, 8, 44, 1, 3, 2, 5, 6, };
		System.out.println("berfore sorting" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

		System.out.println("after sort" + Arrays.toString(a));
	}

}
