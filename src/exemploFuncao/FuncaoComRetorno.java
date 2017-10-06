package exemploFuncao;

import java.util.Scanner;

public class FuncaoComRetorno {

    public static void criarMenu() {

        //Colocar o que vai aconteer ao executar
        System.out.println("Criando menu...");
        System.out.println("--------------------");
        System.out.println("1. Somar 2 números");
        System.out.println("2. Calcular número²");
        System.out.println("3. Raiz quadrada");
        System.out.println("4. Calcular dobro");
        System.out.println("5. Calcular tabuada");
        System.out.println("0. Sair");
        System.out.println("--------------------");

        //Nomes de função seguem a mesma regra de nomes de variavel
    }//Finaliza conteúdo da função

    public static double pedirNumero() {
        Scanner e = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double dig = e.nextInt();

        return dig;

    }

    public static void exemploTipo1() {
        int valor = 10;
        valor = valor * 5;

        System.out.println("A variavel valor vale: " + valor);
    }

    public static void calcularDobro() {

        double n, dobro;

        n = pedirNumero();

        dobro = n * 2;
        System.out.println("Dobro de " + n + " = " + dobro);
    }

    public static void somar2Numeros() {
        Scanner e = new Scanner(System.in);
        double n, o, soma;

        n = pedirNumero();
        o = pedirNumero();

        soma = o + n;
        System.out.println("A soma de " + n + " + " + o + " = " + soma);
    }

    public static void raizQuadrada() {


        double n, resultado;

        n = pedirNumero();
        resultado = Math.sqrt(n);

        System.out.println("A raiz quadrada de " + n + " = " + resultado);
    }

    public static void calcQuadrado() {

        double n, resultado;

        n = pedirNumero();
        resultado = Math.pow(n, 2);

        System.out.println("A raiz quadrada de " + n + " = " + resultado);
    }

    public static void calcTab(double x) {
        for (double i = 1; i <= 10; i++) {
            print(x + " * " + i + " = " + (x * i));
        }
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Início do programa!");
        criarMenu();
        System.out.print("Digite a opção desejada: ");
        while (opcao != 0) {
            opcao = e.nextInt();
            if (opcao == 1) {
                System.out.println("Somar 2 números");
                somar2Numeros();
            } else if (opcao == 2) {
                System.out.println("Calcular número²");
                calcQuadrado();
            } else if (opcao == 3) {
                System.out.println("Calcular Raiz quadrada");
                raizQuadrada();
            } else if (opcao == 5) {
                System.out.println("Calcular tabuada");
                double y = pedirNumero();
                calcTab(y);
            } else if (opcao == 4) {
                System.out.println("Calcular dobro");
                calcularDobro();
//                System.out.println("Digite outra opção: ");
//                opcao = e.nextInt();
            } else {
                System.out.println("Digite um valor válido!");

            }
            System.out.println("Digite a opção desejada: ");
        }
        if (opcao == 0) {
            System.out.println("Fim.");
        }

    }

}
