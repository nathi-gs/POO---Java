package exercicio4;

public class Main {
    public static void main(String[] args) {
        Antibiotico amoxicilina = new Antibiotico("Amoxicilina", 30.0, "Penicilina");
        Analgesico paracetamol = new Analgesico("Paracetamol", 10.0, "500mg");

        amoxicilina.tratarInfeccao();
        paracetamol.aliviarDor();

        System.out.println(amoxicilina);
        System.out.println(paracetamol);
    }
