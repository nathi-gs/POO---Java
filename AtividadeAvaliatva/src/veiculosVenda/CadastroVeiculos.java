package veiculosVenda;

import java.util.ArrayList;
import java.util.Scanner;


public class CadastroVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculos> cadastro = new ArrayList<>();

        System.out.println("Digite 'C' para cadastrar um Carro ou 'M' para cadastrar uma Moto:");
        String escolha = scanner.next();

        while (!escolha.equalsIgnoreCase("C") && !escolha.equalsIgnoreCase("M")) {
            System.out.println("Escolha inválida. Digite 'C' para Carro ou 'M' para Moto:");
            escolha = scanner.next();
        }

        if (escolha.equalsIgnoreCase("C")) {
            System.out.println("Digite o modelo do Carro:");
            String modelo = scanner.next();
            System.out.println("Digite o ano do Carro:");
            int ano = scanner.nextInt();
            System.out.println("Digite o preço do Carro:");
            double preco = scanner.nextDouble();
            System.out.println("Digite a quilometragem do Carro:");
            int km = scanner.nextInt();

            Carro carro = new Carro(modelo, ano, preco, km);
            cadastro.add(carro);
        } else {

            System.out.println("Digite o modelo da Moto:");
            String modelo = scanner.next();
            System.out.println("Digite o ano da Moto:");
            int ano = scanner.nextInt();
            System.out.println("Digite o preço da Moto:");
            double preco = scanner.nextDouble();
            System.out.println("Digite as cilindradas da Moto:");
            int cilindradas = scanner.nextInt();

            Moto moto = new Moto(modelo, ano, preco, cilindradas);
            cadastro.add(moto);
        }

        double totalPrecosAntes = calcularTotalPrecos(cadastro);

        for (Veiculo veiculo : cadastro) {
            if (veiculo instanceof Moto && veiculo.getAno() >= 2008) {
                veiculo.setPreco(veiculo.getPreco() * 1.10);
            }
        }

        for (Veiculo veiculo : cadastro) {
            if (veiculo instanceof Carro && ((Carro) veiculo).getKm() > 100000) {
                veiculo.setPreco(veiculo.getPreco() * 0.92);
            }
        }

        double totalPrecosDepois = calcularTotalPrecos(cadastro);

        System.out.println("\nRelatório de Veículos:");
        for (Veiculo veiculo : cadastro) {
            System.out.println(veiculo);
        }

        System.out.println("\nTotal de Preços Antes dos Ajustes: R$" + totalPrecosAntes);
        System.out.println("Total de Preços Depois dos Ajustes: R$" + totalPrecosDepois);
    }

    private static double calcularTotalPrecos(ArrayList<Veiculo> cadastro) {
        double totalPrecos = 0;
        for (Veiculo veiculo :