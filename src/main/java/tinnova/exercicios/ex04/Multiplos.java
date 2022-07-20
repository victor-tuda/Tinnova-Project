package tinnova.exercicios.ex04;

import java.util.Scanner;
import java.util.Vector;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Instanciando um objeto de scanner
        System.out.println("===== MÚLTIPLOS =====");
        int valor; // variavel para receber o valor inicial
        Vector<Integer> v = new Vector<>(); // vetor para armazenar os valores multiplos de 3 ou 5 no intervalo entre 0 e o valor recebido

        System.out.print("DIGITE UM NÚMERO INTEIRO: ");
        valor = sc.nextInt(); // recebendo o valor

        for(int i=1; i<valor; i++){
            if(i % 3 == 0 || i % 5 == 0){
                v.add(i);
            }
        }
        System.out.println(v.toString());

    }
}
