package atividadeavaliatva;

public class CD extends Midia{

    private int jogo;
    
    public CD (){
        
    }
   public CD (int id, double valor, String nome, int jogo){
       super (id, valor, nome);
       this.jogo = jogo;
   }

    /**
     *
     * @return
     */
    @Override
   public String getTipo(){
      return this.getClass().getSimpleName();  
   }
    @Override
   public String getDetalhes(){
       return "id: " + getId() + ", Valor: " + getValor() +  ", Nome: " + getNome() + "Tipo de Jogo" + getJogo();
   }

    /**
     *
     */
    @Override
   public void printDados(){
       System.out.println("Tipo:"+getTipo());
       System.out.println("Informacoes"+getDetalhes());
   }
    @Override
   public void inserirDados(int id, double valor, String nome){
        super.inserirDados(id, valor, nome);
    }

    public int getjogo() {
        return jogo;
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String getValor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String getJogo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setnMusicas(int jogo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}