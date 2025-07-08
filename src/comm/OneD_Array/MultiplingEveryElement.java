package comm.OneD_Array;

public class MultiplingEveryElement {

	public static int[] multArray(int a[]) {
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int sum = 1;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					sum = sum * a[j];
				}
			}
			b[i] = sum;
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		System.out.println("hello");
		int b[] = multArray(a);
		Array.displayArray(b);

	}

}
