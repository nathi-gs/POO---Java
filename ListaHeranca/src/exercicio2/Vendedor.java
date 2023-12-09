package exercicio2;

public class Vendedor extends Empregado {
    private double valorVendas;
    private int qntVendas;

    public Vendedor(String nome, int idade, String sexo, double salario, String matricula,
            double valorVendas, int qntVendas) {
        super(nome, idade, sexo, salario, matricula);
        this.valorVendas = valorVendas;
        this.qntVendas = qntVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return "Vendedor [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() +
                ", salario=" + getSalario() + ", matricula=" + getMatricula() +
                ", valorVendas=" + valorVendas + ", qntVendas=" + qntVendas + "]";
    }
}
