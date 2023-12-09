package listaheranca;

public class ListaHeranca {

    public static void main(String[] args) {

        Peixe peixe = new Peixe("Dory", 0.8, "Oceano");
        Cachorro cachorro = new Cachorro("Rita", 8.0, "Caramelo");

        System.out.println(peixe.toString());
        System.out.println(cachorro.toString());
    }
}
