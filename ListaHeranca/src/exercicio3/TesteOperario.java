package exercicio3;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Heloysa", "Rua Charme, 734", "987654321", 3, 2500.0, 12.0, 10000.0, 5.0);

        System.out.println("Dados do Operário:");
        System.out.println(operario);

        System.out.println("Salário do Operário: R$" + operario.calcularSalario());

        operario.setComissao(7.0);

        System.out.println("\nDados Atualizados do Operário:");
        System.out.println(operario);

        System.out.println("Novo Salário do Operário: R$" + operario.calcularSalario());
    }
}

