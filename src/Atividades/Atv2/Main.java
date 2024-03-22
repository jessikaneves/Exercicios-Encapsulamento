package Atividades.Atv2;

public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador("Maria","Neves", 100);
        System.out.println("Nome: " + colaborador.getNome());
        System.out.println("Sobrenome: " + colaborador.getSobrenome());
        System.out.println("Salario: " + colaborador.getSalario());
        System.out.println("Salario Anual: " + colaborador.salarioAnual());
        System.out.println("Aumento: "+ colaborador.ajusteSalario());
        System.out.println("Salario anual com aumento:  " + colaborador.salarioAnual());

        System.out.println("-------------------------------------------------------");
        Colaborador colaborador2 = new Colaborador("João","Alves", 1000);
        System.out.println("Nome: " + colaborador2.getNome());
        System.out.println("Sobrenome: " + colaborador2.getSobrenome());
        System.out.println("Salario: " + colaborador2.getSalario());
        System.out.println("Salario Anual: " + colaborador2.salarioAnual());
        System.out.println("Aumento: "+ colaborador2.ajusteSalario());
        System.out.println("Salario anual com aumento: " + colaborador2.salarioAnual());

    }
}