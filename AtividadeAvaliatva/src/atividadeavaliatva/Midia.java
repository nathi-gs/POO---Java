package atividadeavaliatva;

public class Midia {
    private int id;
    private double valor;
    private String nome;
   
    public Midia(){
        
    }
    public Midia (int id, double valor, String nome){
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }
    
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    
   public String getDetalhes() {
        return "id: " + getCodigo() + ", Valor: " + getPreco() + ", Nome: " + getNome();
    }
  
   public void printDados(){
       System.out.println("Categoria"+getTipo());
       System.out.println("Observaçoes"+getDetalhes());
       
       
   }
   
   public void inserirDados(int id, double valor, String nome){
       this.setCodigo(id);
       this.setPreco(valor);
       this.setNome(nome);
   }

    public int getCodigo() {
        return id;
    }

    public void setCodigo(int id) {
        this.id = id;
    }

    public double getPreco() {
        return valor;
    }

    public void setPreco(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}
