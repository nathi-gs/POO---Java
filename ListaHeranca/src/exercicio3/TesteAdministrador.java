package exercicio3;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Nathalia", "Rua Sul, 456", "123456789", 2, 4000.0, 15.0, 500.0);

        System.out.println("Dados do Administrador:");
        System.out.println(administrador);

        System.out.println("Salário do Administrador: R$" + administrador.calcularSalario());

        administrador.setAjudaDeCusto(600.0);

        System.out.println("\nDados Atualizados do Administrador:");
        System.out.println(administrador);

        System.out.println("Novo Salário do Administrador: R$" + administrador.calcularSalario());
    }
}

