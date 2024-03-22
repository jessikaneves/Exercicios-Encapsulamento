package aula1803;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aula1803ex5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        String nomeTarefa;
        while(true){
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Excluir Tarefa");
            System.out.println("3 - Mostrar as Tarefas");
            System.out.println("4 - Sair");


            int opcaomenu = leitura.nextInt();


            switch (opcaomenu){
                case 1:
                    leitura.nextLine();
                    System.out.println("Entrei no adicionar");
                    System.out.println("Digite a tarefa que voce completou");
                    tarefas.add(leitura.nextLine());
                    System.out.println("Cadastrado com Sucesso");
                    break;
                case 2 :
                    System.out.println("Excluir tarefa");


                    for(int i = 0 ; i < tarefas.size() ; i++){
                        System.out.println(" Indice "+ (i+1) + " Tarefa : "+ tarefas.get(i));
                    }
                    System.out.println("Digite o numero da tarefa que quer apagar");
                    int apagar = leitura.nextInt();
                    tarefas.remove((apagar-1));
                    System.out.println("Tarefa apagada com sucesso");
                    break;
                case 3:
                    System.out.println("Mostrando as tarefas cadastradas");
                    for (String tarefasMostrar : tarefas){
                        System.out.println(tarefasMostrar);
                    }
                    System.out.println("Mostrar");
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
