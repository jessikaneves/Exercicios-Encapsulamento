package aula1903v2;
import java.util.Scanner;

public class Main {

    public static int metodoretorno(){
        return 9;
    }
    public static String verificaParImpar(int numero){
        if(numero%2 == 0){
            return "O numero é par";
        }else{
            return "O numero é impar";
        }
    }
    public static void verificaParImpar(int numero , String nome){
        if(numero%2 == 0){
            System.out.println("O numero é par e seu nome é "+ nome);
        }else{
            System.out.println("O numero é impar e seu nome é"+ nome);
        }


    }


    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = leitura.nextInt();
        String retorno = verificaParImpar(numero);
    }
}
