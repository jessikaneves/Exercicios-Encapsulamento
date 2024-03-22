package Atividades.POOparte1;

public class Suprimentos {

        private int numeroItem;
        private String descricaoItem;
        private int quantidadeComprada;
        private double precoUnitarioItem;

        // Construtor
        public Suprimentos(int numeroItem, String descricaoItem, int quantidadeComprada, double precoUnitarioItem) {
            this.numeroItem = numeroItem;
            this.descricaoItem = descricaoItem;

            // Verifica se a quantidade comprada é positiva, caso contrário, define como 0
            if (quantidadeComprada > 0) {
                this.quantidadeComprada = quantidadeComprada;
            } else {
                this.quantidadeComprada = 0;
            }

            // Verifica se o preço unitário do item é positivo, caso contrário, define como 0.0
            if (precoUnitarioItem > 0.0) {
                this.precoUnitarioItem = precoUnitarioItem;
            } else {
                this.precoUnitarioItem = 0.0;
            }
        }

        // Método getter para o número do item
        public int getNumeroItem() {
            return numeroItem;
        }

        // Método getter para a descrição do item
        public String getDescricaoItem() {
            return descricaoItem;
        }

        // Método getter para a quantidade comprada do item
        public int getQuantidadeComprada() {
            return quantidadeComprada;
        }

        // Método setter para a quantidade comprada do item
        public void setQuantidadeComprada(int quantidadeComprada) {
            if (quantidadeComprada > 0) {
                this.quantidadeComprada = quantidadeComprada;
            } else {
                this.quantidadeComprada = 0;
            }
        }

        // Método getter para o preço unitário do item
        public double getPrecoUnitarioItem() {
            return precoUnitarioItem;
        }

        // Método setter para o preço unitário do item
        public void setPrecoUnitarioItem(double precoUnitarioItem) {
            if (precoUnitarioItem > 0.0) {
                this.precoUnitarioItem = precoUnitarioItem;
            } else {
                this.precoUnitarioItem = 0.0;
            }
        }

        // Método para calcular o valor da fatura
        public double getInvoiceAmount() {
            return quantidadeComprada * precoUnitarioItem;
        }
    }


