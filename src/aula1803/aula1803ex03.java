package aula1803;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class aula1803ex03 {
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
            if (nome.equalsIgnoreCase("sair")){
                break;
            }
            nomes.add(nome);
        }


        String procurarnome = "Rafael";
        if(nomes.contains(procurarnome)){
            System.out.println("Sim o nome existe no array");
        }else{
            System.out.println("o nome NÃO existe no array");
        }


        //nome.toLowerCase(); //deixa a string em minusculo
        // nome.toUpperCase(); // deixa a string em maiusculo








        for(String nomelista : nomes){
            System.out.println(nomelista);
        }


    }
}
