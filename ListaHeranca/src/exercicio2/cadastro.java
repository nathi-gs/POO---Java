package exercicio2;

public class cadastro {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Luis", 30, "Masculino", 5000.0, "123456");

        System.out.println("INSS do empregado: " + empregado.valorInss());

        Cliente cliente = new Cliente("Heloysa", 25, "Feminino", 1000.0, 1990);

        System.out.println("Dados do cliente: " + cliente);

        Vendedor vendedor = new Vendedor("Nathalia", 21, "Feminino", 1700.0, "789012", 50000.0, 50);

        System.out.println("Dados do vendedor: " + vendedor);
    }
}






