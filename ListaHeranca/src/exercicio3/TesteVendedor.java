package exercicio3;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Vania", "Rua Dezembro, 1212", "123456789", 4, 2000.0, 8.0, 15000.0, 3.0);

        System.out.println("Dados do Vendedor:");
        System.out.println(vendedor);

        System.out.println("Salário do Vendedor: R$" + vendedor.calcularSalario());

        vendedor.setComissao(5.0);

        System.out.println("\nDados Atualizados do Vendedor:");
        System.out.println(vendedor);

        System.out.println("Novo Salário do Vendedor: R$" + vendedor.calcularSalario());
    }
}

