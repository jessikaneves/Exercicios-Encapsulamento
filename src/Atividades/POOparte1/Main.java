package Atividades.POOparte1;

public class Main {


        public static void main(String[] args) {
            // Criando um objeto da classe Suprimentos
            Suprimentos suprimento1 = new Suprimentos(1, "Teclado", 2, 25.5);

            // Demonstrando os métodos getters
            System.out.println("Número do item: " + suprimento1.getNumeroItem());
            System.out.println("Descrição do item: " + suprimento1.getDescricaoItem());
            System.out.println("Quantidade comprada: " + suprimento1.getQuantidadeComprada());
            System.out.println("Preço unitário do item: " + suprimento1.getPrecoUnitarioItem());

            // Demonstrando os métodos setters
            suprimento1.setQuantidadeComprada(3);
            suprimento1.setPrecoUnitarioItem(30.0);
            System.out.println("Nova quantidade comprada: " + suprimento1.getQuantidadeComprada());
            System.out.println("Novo preço unitário do item: " + suprimento1.getPrecoUnitarioItem());

            // Demonstrando o método getInvoiceAmount
            System.out.println("Valor da fatura: " + suprimento1.getInvoiceAmount());
        }
    }


