package aula1803;
import java.util.*;
//* com metodos

public class Main {
    static Scanner leitura = new Scanner(System.in);
    static ArrayList<String> tarefas = new ArrayList<>();
    public static void adcionarTarefa(){
        leitura.nextLine();
        System.out.println("Entrei no adicionar");
        System.out.println("Digite a tarefa que voce completou");
        tarefas.add(leitura.nextLine());
        System.out.println("Cadastrado com Sucesso");
    }
    public static void excluirTarefa(){
        System.out.println("Excluir tarefa");
        for(int i = 0 ; i < tarefas.size() ; i++){
            System.out.println(" Indice "+ (i+1) + " Tarefa : "+ tarefas.get(i));
        }
        System.out.println("Digite o numero da tarefa que quer apagar");
        int apagar = leitura.nextInt();
        tarefas.remove((apagar-1));
        System.out.println("Tarefa apagada com sucesso");
    }
    public static void mostrarTarefa(){
        System.out.println("Mostrando as tarefas cadastradas");
        for (String tarefasMostrar : tarefas){
            System.out.println(tarefasMostrar);
        }
        System.out.println("Mostrar");
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Excluir Tarefa");
            System.out.println("3 - Mostrar as Tarefas");
            System.out.println("4 - Sair");


            int opcaomenu = leitura.nextInt();


            switch (opcaomenu){
                case 1:
                    adcionarTarefa();
                    break;
                case 2 :
                    excluirTarefa();
                    break;
                case 3:
                    mostrarTarefa();
                    break;
                case 4:
                    System.out.println("Sair");
                    return;
                default:
                    System.out.println("Digite uma opcao valida ");
            }
        }






    }
}
