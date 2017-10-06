package algoritmos;

import java.util.Scanner;

public class Algoritmos {

    //Classe Metade
    public static double metade(double n) {
        double r = n / 2;
        return n;

    }

    //classe quadrado de um número
    public static double quadrado(double n) {

        double r = n * n;
        //Retorno = pega o resultado e joga para a variavel que vc definir(nesse caso deve ser double).
        return n;

    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        //Calcular Raiz quadrada
        double raiz = Math.sqrt(15);

        System.out.println("A raiz é " + raiz);

        //Calcular Quadrado de um número
        double result = quadrado(5);

        System.out.println("O quadrado de 5 é " + result);

        //Metade de um número
        double resu = metade(100);

        System.out.println("A metade de 100 é " + resu);

    }

}
