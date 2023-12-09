package veiculosVenda;

class Carro extends Veiculos {
    private int km;

    public Carro(String modelo, int ano, double preco, int km) {
        super(modelo, ano, preco);
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Carro [" + super.toString() + ", km=" + km + "]";
    }
}