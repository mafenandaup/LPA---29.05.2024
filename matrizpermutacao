package boy;

import java.util.Random;

public class cris {

	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(5);
		int matriz[][] = new int[i][i];
		gerarmatriz(matriz);
		imprimirMatriz(matriz);
		System.out.println(" ");
		if (ePermutacao(matriz)) {
			System.out.println("E matriz de permutacao");
		} else {
			System.out.println("Nao e matriz de permutacao");
		}

	}

	public static int[][] gerarmatriz(int[][] m) {
		int i, j;
		Random rand = new Random();
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[i].length; j++) {
				m[i][j] = rand.nextInt(2);
			}
		}
		return m;
	}

	public static void imprimirMatriz(int m[][]) {
		int i, j;
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean ePermutacao(int[][] m) {
		int soma;
		boolean resp = true;
		for (int i = 0; i < m.length; i++) {
			soma = 0;
			for (int j = 0; j < m[i].length; j++) {
				soma += m[i][j];
			}
			if (soma != 1) {
				resp = false;
			}
		}

		for (int i = 0; i < m[0].length; i++) {
			soma = 0;
			for (int j = 0; j < m.length; j++) {
				soma += m[j][i];
			}
			if (soma != 1) {
				resp = false;
			}
		}
		return resp;
	}
}
