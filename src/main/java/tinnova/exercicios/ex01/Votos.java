package tinnova.exercicios.ex01;

public class Votos implements IVotos{
    private double totalEleitores;
    private double votosValidos;
    private double votosBrancos;
    private double votosNulos;

    public Votos(int totalEleitores, int votosValidos, int votosBrancos, int votosNulos) {
        setTotalEleitores(totalEleitores);
        setVotosValidos(votosValidos);
        setVotosBrancos(votosBrancos);
        setVotosNulos(votosNulos);
    }

    public void setTotalEleitores(int totalEleitores) {
        this.totalEleitores = totalEleitores;
    }

    public void setVotosValidos(int votosValidos) {
        this.votosValidos = votosValidos;
    }

    public void setVotosBrancos(int votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public double getTotalEleitores() {
        return totalEleitores;
    }

    public double getVotosValidos() {
        return votosValidos;
    }

    public double getVotosBrancos() {
        return votosBrancos;
    }

    public double getVotosNulos() {
        return votosNulos;
    }

    @Override
    public void percentualVotosValidos() {
        double resp = getVotosValidos() / getTotalEleitores() * 100;
        System.out.printf("PERCENTUAL DE VOTOS VALIDOS: %.2f%%\n", resp);
    }

    @Override
    public void percentualVotosBrancos() {
        double resp = getVotosBrancos() / getTotalEleitores() * 100;
        System.out.printf("PERCENTUAL DE VOTOS BRANCOS: %.2f%%\n", resp);
    }

    @Override
    public void percentualVotosNulos() {
        double resp = getVotosNulos() / getTotalEleitores() * 100;
        System.out.printf("PERCENTUAL DE VOTOS NULOS: %.2f%%\n", resp);
    }

    @Override
    public String toString() {
        return "Votos{" +
                "totalEleitores=" + totalEleitores +
                ", votosValidos=" + votosValidos +
                ", votosBrancos=" + votosBrancos +
                ", votosNulos=" + votosNulos +
                '}';
    }
}
