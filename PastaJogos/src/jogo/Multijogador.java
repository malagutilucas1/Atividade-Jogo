package jogo;

public class Multijogador extends Jogo {

    private int numeroDeJogadoresMaximos;

    /**
     */
    public Multijogador(String nome, String desenvolvedor, String genero, int anoLancamento, double preco) {
        super();
    }

    public int getNumeroDeJogadoresMaximos() {
        return numeroDeJogadoresMaximos;
    }

    public void setNumeroDeJogadoresMaximos(int numeroDeJogadoresMaximos) {
        this.numeroDeJogadoresMaximos = numeroDeJogadoresMaximos;
    }
}
