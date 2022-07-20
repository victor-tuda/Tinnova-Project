package tinnova.exercicios.ex03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Instanciando um objeto de scanner
        System.out.println("===== FATORIAL =====");
        int valor; // variavel para receber o valor inicial
        int fatorial = 1; // variavel para acumular o produtório da iteração do fatorial

        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        valor = sc.nextInt(); // recebendo o valor

        if (valor == 0) // caso o fatorial seja 0, devolve-se o resultado igual a 1
            System.out.printf("%d! = %d", valor, fatorial);
        else{ // para qualquer outro caso que o valor seja diferente de 0
            for (int i=0; i<valor; i++){
                fatorial *= valor-i;
            }
            System.out.printf("%d! = %d", valor, fatorial);
        }
    }
}
