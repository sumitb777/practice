package practice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Firstrepeted {

	public static void main(String[] args) {

		int a[] = { 454, 6, 87, 94, 1, 4, 54 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}
				}
		}
		System.out.println(Arrays.toString(a));

	}
}
