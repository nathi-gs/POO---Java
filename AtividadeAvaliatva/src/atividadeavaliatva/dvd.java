package atividadeavaliatva;

public class dvd extends Midia {
    private int Classificacao;
    
    public dvd(){
        
    }
    
    public dvd(int id, double valor, String nome, int Classificacao){
        super (id,valor,nome);
        this.Classificacao = Classificacao;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getTipo(){
        return this.getClass().getSimpleName();
    }

    /**
     *
     * @return
     */
    @Override
    public String getDetalhes(){
        return "id: " + getId() + ", valor: " + getValor() + ", Nome: " + getNome() + "Classificacao: " + getClassificacao();
    }
    public void pritDados(){
        System.out.println("Categoria:"+getCategoria());
        System.out.println("Observacao:"+getObservacao());
    }
    @Override
    public void inserirDados(int id, double valor, String nome){
        super.inserirDados(id, valor, nome);
        this.setClassificacao(getClassificacao());
    }

    public int getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(int Classificacao) {
        this.Classificacao = Classificacao;
    }

    private String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String getValor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String getCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String getObservacao() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}