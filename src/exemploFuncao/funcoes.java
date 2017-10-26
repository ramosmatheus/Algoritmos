package exemploFuncao;

import java.util.Scanner;

public class funcoes {

    public static void func1() {
        System.out.println("Função sem retorno e parâmetro.");
        System.out.println("criar menus por exemplo");
    }

    public static void func2(int p, int p2) {
        System.out.println("Para guardar dados");

    }

    public static int calcIdade(int ano) {

        return 2017 - ano;
        
    }
    public static int pedirNum(){
        Scanner e = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int n = e.nextInt();
        
        return n;
        
    }

    public static void main(String[] args) {

        
        System.out.println(calcIdade(1999));
        
    }

}
