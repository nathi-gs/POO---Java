package veiculosVenda;

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, int ano, double preco, int cilindradas) {
        super(modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString() + ", cilindradas=" + cilindradas + "]";
    }
}
