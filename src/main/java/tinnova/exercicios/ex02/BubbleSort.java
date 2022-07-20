package tinnova.exercicios.ex02;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Referência https://www.softwaretestinghelp.com/bubble-sort-java/
        System.out.println("===== BUBBLE SORT =====");
        int v[] = {5, 3, 2, 4, 7, 1, 0, 6};
        System.out.println("VETOR ORIGINAL: " + Arrays.toString(v));

        int tam = v.length; // Recebendo o tamanho do vetor

        for (int i=0; i<tam-1; i++){ // Realizando uma quantidade i de iterações em função do tamanho do vetor
            for (int j=0; j<tam-i-1; j++){ // Iterando o vetor de modo a jogar o maior valor para o último índice
                if (v[j] > v[j+1]){ // Analisando os valores de par em par e verificando se estão ordenados
                    int aux = v[j]; // Salvando um valor em uma variavel auxiliar
                    v[j] = v[j+1]; // Trocando os valores
                    v[j+1] = aux; // Trocando os valores
                }
            }
        }

        System.out.println("VETOR ORDENADO: " + Arrays.toString(v));

    }
}
