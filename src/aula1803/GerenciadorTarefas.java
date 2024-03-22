package aula1803;

import java.util.Scanner;

public class GerenciadorTarefas {
    private static String[] tarefas = new String[100]; // Array para armazenar as tarefas
    private static int contadorTarefas = 0; // Contador para acompanhar o número de tarefas adicionadas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            // Exibir menu
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar nova tarefa");
            System.out.println("2. Remover tarefa existente");
            System.out.println("3. Exibir todas as tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine()); // Leitura de linha e conversão para inteiro
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                opcao = 0; // Definindo opcao como 0 para evitar loops infinitos
            }


            // Executar a opção escolhida
            switch (opcao) {
                case 1:
                    adicionarTarefa(scanner);
                    break;
                case 2:
                    removerTarefa(scanner);
                    break;
                case 3:
                    exibirTarefas();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void adicionarTarefa(Scanner scanner) {
        System.out.print("Digite a nova tarefa: ");
        String novaTarefa = scanner.next();
        tarefas[contadorTarefas] = novaTarefa;
        contadorTarefas++;
        System.out.println("Tarefa adicionada com sucesso!");
    }

    private static void removerTarefa(Scanner scanner) {
        if (contadorTarefas == 0) {
            System.out.println("Não há tarefas para remover.");
            return;
        }

        System.out.print("Digite o índice da tarefa a ser removida (entre 0 e " + (contadorTarefas - 1) + "): ");
        int indice = scanner.nextInt();

        if (indice < 0 || indice >= contadorTarefas) {
            System.out.println("Índice inválido.");
            return;
        }

        for (int i = indice; i < contadorTarefas - 1; i++) {
            tarefas[i] = tarefas[i + 1];
        }
        contadorTarefas--;
        System.out.println("Tarefa removida com sucesso!");
    }

    private static void exibirTarefas() {
        if (contadorTarefas == 0) {
            System.out.println("Não há tarefas pendentes.");
            return;
        }

        System.out.println("\nTarefas Pendentes:");
        for (int i = 0; i < contadorTarefas; i++) {
            System.out.println(i + ". " + tarefas[i]);
        }
    }
}
