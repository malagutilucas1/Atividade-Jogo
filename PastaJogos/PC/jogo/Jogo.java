package jogo;

import jogo.java.PC;

public class Jogo {

    private static Jogo[] todosJogos;
    private String nome;
    private String requisitos;
    private boolean multijogador;

    public Jogo(String nome, String requisitos, boolean multijogador) {
        this.nome = nome;
        this.requisitos = requisitos;
        this.multijogador = multijogador;
    }

    public Jogo() {
    }

    public static void listarJogos() {
    }

    public static void listarJogosGenero(String genero) {
    }

    public static void listarJogosAno(int ano) {
    }

    public static void listarJogosRequisitos(PC pc) {
        for (Jogo jogo : Jogo.todosJogos) {
            if (jogo.verificarRequisitos(pc)) {
                System.out.println(jogo);
            }
        }
    }

    public static void listarJogosPromocao() {
    }

    public String getNome() {
        return this.nome;
    }

    public String getRequisitos() {
        return this.requisitos;
    }

    public boolean isMultijogador() {
        return this.multijogador;
    }

    public int getRequisitosMemoriaRAM() {
        return 8;
    }

    public int getRequisitosProcessador() {
        return (int) 2.5;
    }

    public void setNumeroDeJogadoresMaximos(int numeroDeJogadoresMaximos) {
    }

    public void setNome(String nome) {
    }

    public void setDesenvolvedor(String desenvolvedor) {
    }

    public void setAnoLancamento(int anoLancamento) {
    }

    public void setPreco(double preco) {
    }

    public boolean verificarRequisitos(PC pc) {
        int requisitosMemoriaRAM = pc.getRequisitosMemoriaRAM();
        return pc.getMemoriaRAM() >= requisitosMemoriaRAM;
    }


}
