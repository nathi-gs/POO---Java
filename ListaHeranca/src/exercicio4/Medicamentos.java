package exercicio4;

public class Medicamento {
    private String nome;
    private double preco;

    public Medicamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Medicamento [nome=" + nome + ", preco=" + preco + "]";
    }
}

public class Antibiotico extends Medicamento {
    private String tipo;

    public Antibiotico(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void tratarInfeccao() {
        System.out.println(getNome() + " está tratando uma infecção.");
    }

    @Override
    public String toString() {
        return "Antibiotico [tipo=" + tipo + ", " + super.toString() + "]";
    }
}

public class Analgesico extends Medicamento {
    private String dosagem;

    public Analgesico(String nome, double preco, String dosagem) {
        super(nome, preco);
        this.dosagem = dosagem;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public void aliviarDor() {
        System.out.println(getNome() + " está aliviando a dor.");
    }

    @Override
    public String toString() {
        return "Analgésico [dosagem=" + dosagem + ", " + super.toString() + "]";
    }
}


