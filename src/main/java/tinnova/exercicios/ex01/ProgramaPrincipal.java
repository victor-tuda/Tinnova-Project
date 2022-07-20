package tinnova.exercicios.ex01;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        System.out.println("=== PERCENTUAL DE VOTOS ===");
        Votos v1 = new Votos(1000, 800, 150, 50);

        System.out.println(v1);
        v1.percentualVotosValidos();
        v1.percentualVotosBrancos();
        v1.percentualVotosNulos();
    }
}
