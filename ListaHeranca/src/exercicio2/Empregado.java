package exercicio2;

  public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public Empregado(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo);
        this.salario = salario;
        this.matricula = matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() +
                ", salario=" + salario + ", matricula=" + matricula + "]";
    }
}
