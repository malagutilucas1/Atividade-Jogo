import java.util.Scanner;
import jogo.Jogo;
import jogo.java.PC;

public class Execução {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Menu de opções");
            System.out.println("1 - Listagem dos jogos");
            System.out.println("2 - Listagem de jogos por gênero");
            System.out.println("3 - Listagem de jogos por ano");
            System.out.println("4 - Listagem de jogos por determinados requisitos de hardware");
            System.out.println("5 - Listagem de jogos que estão em promoção");
            System.out.println("6 - Criação de um novo título de jogo");
            System.out.println("7 - Sair");

            int opcao;
            try {
                opcao = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Opção inválida.");
                return;
            }

            switch (opcao) {
                case 1 -> Jogo.listarJogos();
                case 2 -> {
                    String genero = scanner.nextLine();
                    Jogo.listarJogosGenero(genero);
                }
                case 3 -> {
                    int ano = scanner.nextInt();
                    Jogo.listarJogosAno(ano);
                }
                case 4 -> {
                    String modelo = scanner.nextLine();
                    String processador = scanner.nextLine();
                    int memoriaRAM = scanner.nextInt();
                    int armazenamento = scanner.nextInt();
                    PC pc = new PC(modelo, memoriaRAM, armazenamento);
                    Jogo.listarJogosRequisitos(pc);
                }
                case 5 -> Jogo.listarJogosPromocao();
                case 6 -> {
                    String nome = scanner.nextLine();
                    String desenvolvedor = scanner.nextLine();
                    int anoLancamento = scanner.nextInt();
                    double preco = scanner.nextDouble();
                    int numeroDeJogadoresMaximos = scanner.nextInt();
                    Jogo jogo = new Jogo();
                    jogo.setNome(nome);
                    jogo.setDesenvolvedor(desenvolvedor);
                    jogo.setAnoLancamento(anoLancamento);
                    jogo.setPreco(preco);
                    jogo.setNumeroDeJogadoresMaximos(numeroDeJogadoresMaximos);
                    System.out.println("Jogo criado com sucesso.");
                }
                case 7 -> System.out.println("Obrigado por usar a nossa lista de jogos.");
            }
        }
    }
}
