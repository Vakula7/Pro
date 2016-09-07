import java.util.Scanner;

public class UniqueElement {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 0; j < size; j++) {
			if (a[j] != 500) {
				for (int z = j + 1; z < size; z++) {
					if (a[j] == a[z]) {
						a[j] = 500;
						a[z] = 500;
					}

				}

			}
		}
		for (int q = 0; q < size; q++) {
			if (a[q] != 500)
				System.out.println(a[q]);
		}

	}

}
