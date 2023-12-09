package exercicio3;

public class TesteFornecedor {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Fornecedor Remedio", "Rua Conquista, 113", "987654321", 5000.0, 2000.0);

        System.out.println("Dados do Fornecedor:");
        System.out.println(fornecedor);

        System.out.println("Saldo do Fornecedor: R$" + fornecedor.obterSaldo());

        fornecedor.setValorCredito(8000.0);
        fornecedor.setValorDivida(3000.0);

        System.out.println("\nDados Atualizados do Fornecedor:");
        System.out.println(fornecedor);

        System.out.println("Novo Saldo do Fornecedor: R$" + fornecedor.obterSaldo());
    }
}

