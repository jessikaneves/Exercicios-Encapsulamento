package aula1803;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aula1803ex2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nome = "teste";
        System.out.println("Digite nomes e digite 'sair' para finalizar a operacao");
      /* while (!nome.equals("sair")){
           System.out.println("Digite o nome");
           nome = leitura.nextLine();
           nomes.add(nome);
       }*/
        while (true){
            System.out.println("Digite o nome");
            nome = leitura.nextLine();
            if (nome.equals("sair")){
                break;
            }
            nomes.add(nome);
        }






        for(String nomelista : nomes){
            System.out.println(nomelista);
        }


    }
}
