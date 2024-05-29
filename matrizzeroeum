package boy;

import java.util.Random;

public class matrizzeroeum {

	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(6);
		int matriz[][] = new int[i][i];
		matrizgen(matriz);
		escrevermatriz(matriz);
	}
	public static int[][] matrizgen(int v[][]) {
		int i, j;
		for (i = 0; i < v[0].length; i++) {
			for (j = 0; j < v.length; j++) {
		if (i%2 ==0 ) {
			v[j][i] = 1;
		}else {
			v[j][i] = 0;
		}

			}
		}
		return v;
	}

public static void escrevermatriz(int v[][]) {
	int i, j;
	for (i = 0; i < v.length; i++) {
		for (j = 0; j < v[i].length; j++) {
				System.out.print(v[i][j] + " ");
			}
		System.out.println();
		}
	}
}
