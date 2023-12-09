package exercicio3;

public class TesteEmpregado {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("Luis", "Rua Almenara, 114", "987654321", 1, 3000.0, 10.0);

        System.out.println("Dados do Empregado:");
        System.out.println(empregado);

        System.out.println("Salário Líquido do Empregado: R$" + empregado.calcularSalarioLiquido());

        System.out.println("Salário do Empregado (sem desconto): R$" + empregado.calcularSalario());

        empregado.setSalarioBase(3500.0);

        System.out.println("\nDados Atualizados do Empregado:");
        System.out.println(empregado);

        System.out.println("Novo Salário Líquido do Empregado: R$" + empregado.calcularSalarioLiquido());
    }
}

