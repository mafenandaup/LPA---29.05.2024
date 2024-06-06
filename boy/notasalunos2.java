package boy;

import java.util.Random;

public class notasalunos2 {

	public static void main(String[] args) {
		String alunos[] = { "clara", "maria", "jones", "ednaldo", "debora" };
		int notas[][] = new int[5][4];
		System.out.println("ALUNOS E SUAS NOTAS");
		System.out.println(" ");
		printAlunos(alunos);
		generate(notas);
		printgrade(notas);
		medias(alunos,notas);
	}

	public static void printAlunos(String[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.print(alunos[i] + " ");
		}
		System.out.println(" ");
	}

	public static int[][] generate(int m[][]) {
		int i, j;
		Random rd = new Random();
		for (i = 0; i < m.length; i++) {
			for (j = 0; j < m[i].length; j++) {
				m[i][j] = rd.nextInt(10);
			}
		}
		return m;
	}

	public static void printgrade(int m[][]) {
		int i, j;
		Random rd = new Random();
		for (j = 0; j < m.length; j++) {
			for (i = 0; i < m[j].length; i++) {
				System.out.print(m[j][i] + "        ");
			}
			System.out.println();
		}

	}

	public static void medias(String[] alunos, int m[][]) {

		System.out.println("\nMÉDIAS DOS ALUNOS:");
	    for (int i = 0; i < alunos.length; i++) {
	        int somaNotas = 0;
	        for (int j = 0; j < m[i].length; j++) {
	            somaNotas += m[i][j];
	        }
	        double media = (double) somaNotas / m[i].length;
	        System.out.println(alunos[i] + ": " + media);
	    }
	}
}
