package exercicios;

import java.util.Scanner;

public class calculadora {

    public static void menu() {

        System.out.println("--------------------");
        System.out.println("1. Somar 2 números");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("5. Divisão");
        System.out.println("0. Sair");
        System.out.println("--------------------");

    }

    public static int pedirNumero() {
        Scanner e = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = e.nextInt();

        return n;
    }

    public static int somar2Numeros() {

        int n, o, soma;

        n = pedirNumero();
        o = pedirNumero();

        soma = o + n;
        System.out.println("A soma de " + n + " + " + o + " = " + soma);

        return soma;
    }

    public static int subtrair2Numeros() {

        int n, o, subtrair;

        n = pedirNumero();
        o = pedirNumero();

        subtrair = n - o;

        System.out.println("A subtração de " + n + " - " + o + " = " + subtrair);

        return subtrair;
    }

    public static int multiplicar2Num() {

        int n, o, mult;

        n = pedirNumero();
        o = pedirNumero();

        mult = n * 0;

        System.out.println(n + " x " + o + " = " + mult);

        return mult;
    }

    public static int divisao2Num() {

        int n, o, div;

        n = pedirNumero();
        o = pedirNumero();

        div = n / o;

        System.out.println(n + " / " + o + " = " + div);

        return div;

    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int opcao = 1;

        menu();

        System.out.print("Digite a opção desejada: ");

        while (opcao != 0) {
            opcao = e.nextInt();
            if (opcao == 1) {
                System.out.println("Soma");
                somar2Numeros();
            } else if (opcao == 2) {
                System.out.println("Subtração");
                subtrair2Numeros();
            } else if (opcao == 3) {
                System.out.println("Multiplicação");
                multiplicar2Num();
            } else if (opcao == 4) {
                System.out.println("Divisão");
                divisao2Num();
            } else {
                System.out.println("Digite um valor válido!");

            }
            menu();
            System.out.println("Digite a opção desejada: ");
        }
        if (opcao == 0) {
            System.out.println("Fim.");
        }

    }
}
