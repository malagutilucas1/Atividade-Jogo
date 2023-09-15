package jogo.java;

import jogo.Jogo;

public class PC {

    private String modelo;
    private int armazenamento;
    private int memoriaRAM;
    public int processador;

    public PC(String modelo, int armazenamento, int memoriaRAM) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.setMemoriaRAM(memoriaRAM);
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public static int getMemoriaRAMPadrao() {
        return 8;
    }

    public static int getProcessadorPadrao() {
        return (int) 2.5;
    }

    public boolean verificarRequisitos(Jogo jogo) {
        int requisitosMemoriaRAM = jogo.getRequisitosMemoriaRAM();
        int requisitosProcessador = jogo.getRequisitosProcessador();

        if (getMemoriaRAM() >= requisitosMemoriaRAM) {
            int processador = Integer.parseInt(String.valueOf(this.processador));

            return processador >= requisitosProcessador;

        }

        return false;
    }

    @Override
    public String toString() {
        return "PC"
                + "modelo='" + modelo + '\''
                + ",armazenamento=" + armazenamento
                + ",memoriaRAM=" + getMemoriaRAM()
                + '.';
    }

    public int getRequisitosMemoriaRAM() {
        return 0;
    }

    public int getRequisitosProcessador() {
        return 0;
    }
}
