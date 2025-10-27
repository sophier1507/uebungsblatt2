package h2;

public class H2_main {

	public static void main(String[] args) {
		int i, j, k, min, max;
		i = 3;
		j = 2;
		k = 1;
		min = 3;
		max = 2;
		System.out.println("i: " + i + " j: " + j + " k: " + k);
		if ((i < j) && (i < k)) {
			min = i;
			if (j < k) {
				max = k;
			}
			else {
				max = j;
			}
		}
		else if (j < k) {
			min = j;
			if (i < k) {
				max = k;
			}
			else {
				max = i;
			}
		}
		else {
			min = k;
			if (i < j) {
				max = j;
			}
			else {
				max = i;
			}
		}
		System.out.println("Das Maximum ist " + max + " und das Minimum ist " + min);
	}

}
