package matriz;

import java.util.Random;

public class matriz2 {

    public static void main(String[] args) {

        Random r = new Random();

        System.out.println("Número: " + r.nextInt(3));

        int[][] matriz = new int[5][10];
     
        for (int linha = 0; linha <= 4; linha++) {

            for (int coluna = 0; coluna <= 9; coluna++) {

                matriz[linha][coluna] = r.nextInt(100);

            }

        }
        for (int linha = 0; linha <= 4; linha++) {
            System.out.println(" ");
            for (int coluna = 0; coluna <= 9; coluna++) {

                System.out.print(matriz[linha][coluna] + "  ");

            }
            System.out.println("");
        }
        System.out.println("");

        /////////////////////////////////////////////////////
        int maior = 0, menor = 100, x = 0, y = 0, mex = 0, mey = 0;

        for (int linha = 0; linha <= 4; linha++) {

            for (int coluna = 0; coluna <= 9; coluna++) {

                if (maior < matriz[linha][coluna]) {
                    maior = matriz[linha][coluna];
                    x = linha+1;
                    y = coluna+1;
                }

                if (menor > matriz[linha][coluna]) {
                    menor = matriz[linha][coluna];
                    mex = linha+1;
                    mey = coluna+1;
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("É o maior número: " + maior + " ");
        System.out.println("Na posição x: " + x + " ");
        System.out.println("Na posição y: " + y);
        System.out.println("-------------------------");
        System.out.println("É o menor número: " + menor);
        System.out.println("Na posição x: " + mex);
        System.out.println("Na posição y: " + mey);

    }

}
