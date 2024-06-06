package boy;

import java.util.Random;

public class matriznaordem {

	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(6);
		int j = rand.nextInt(6);
		int matriz[][] = new int[i][j];
		matrizgen(matriz);
		verify(matriz);
	}

	public static int[][] matrizgen(int v[][]) {
		int i, j;
		int cont=0;
		for (i = 0; i < v[0].length; i++) {
			for (j = 0; j < v.length; j++) {
				v[j][i] = cont= cont+1;

			}
		}
		return v;
	}
	public static void verify(int v[][]) {
		int i, j;
		for (i = 0; i < v.length; i++) {
			for (j = 0; j < v[i].length; j++) {
					System.out.print(v[i][j] + " ");
				}
			System.out.println();
			}
		}
}
