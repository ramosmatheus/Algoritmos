package matriz;

public class matriz {

    public static void main(String[] args) {

        //Criar um vetor com 5 colunas
        //O vetor sempre tem 1 linha
        int[] vetor = new int[5];

        // Preencher o vetor com números
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 3;

        }
        
        
        // Criando matriz 3x4(linhaxColuna)
        int[][] matriz = new int[3][4];

        // Percorrendo as linhas da matriz
        for (int linha = 0; linha <= 2; linha++) {

            // Percorrer colunas da matriz
            for (int coluna = 0; coluna <=3; coluna++){
                
                // Preenchendo.....
                matriz[linha][coluna]= linha*coluna;
                
                
                
            }
            
        }

       //mostrando a matriz na saída
       
       for(int linha = 0 ; linha <=2; linha++){
           System.out.println(" ");
           for(int coluna = 0 ; coluna <=3 ; coluna++){
               
               System.out.print(matriz[linha][coluna]+"  ");
               
               
           }
           
       }
    }

}
