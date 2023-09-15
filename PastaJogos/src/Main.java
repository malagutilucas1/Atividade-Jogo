import java.util.Scanner;

import jogo.Jogo;
public class Main {

    public static class Executar {

        public static void main(String[] args) {
            try (var scanner = new Scanner(System.in)) {
                {
                    Jogo[] jogos = new Jogo[10];

                    while (true) {
                        System.out.println("Abrir o menu:");
                        System.out.println("1. Abrir lista dos jogos");
                        System.out.println("2. Adicionar jogo:");
                        System.out.println("3. Verificar os requisitos do jogo selecionado:");
                        System.out.println("4. Ver se é multijogador:");
                        System.out.println("5. Sair");

                        System.out.print("Selecione o número da opção desejada: ");
                        int opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:
                                for (Jogo jogo : jogos) {
                                    if (jogo != null) {
                                        System.out.println(jogo.getNome());
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Nome do jogo: ");
                                String nome = scanner.nextLine();

                                System.out.print("Requisitos do jogo: ");
                                String requisitos = scanner.nextLine();

                                System.out.print("Multijogador? (true/false): ");
                                boolean multijogador = scanner.nextBoolean();

                                jogos[jogos.length - 1] = new Jogo(nome, requisitos, multijogador);
                                break;
                            case 3:
                                System.out.print("Nome do jogo: ");
                                nome = scanner.nextLine();

                                for (Jogo jogo : jogos) {
                                    if (jogo != null && jogo.getNome().equals(nome)) {
                                        System.out.println("Requisitos do jogo:");
                                        System.out.println(jogo.getRequisitos());
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                System.out.print("Nome do jogo: ");
                                nome = scanner.nextLine();

                                for (Jogo jogo : jogos) {
                                    if (jogo != null && jogo.getNome().equals(nome)) {
                                        System.out.println("Multijogador?: " + jogo.isMultijogador());
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Fim.");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("A opção é inválida.");
                                break;
                        }
                    }
                }
            }    
        }               
    }
}
