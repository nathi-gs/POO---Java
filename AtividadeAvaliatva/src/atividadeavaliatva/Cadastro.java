package atividadeavaliatva;
import java.util.Scanner;

public class Cadastro {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do Jogo:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o valor do Jogo:");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Digite o id do Jogo:");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o tipo de jogo:");
        int jogo = scanner.nextInt();
        scanner.nextLine();
        
        CD cd = new CD(id, valor, nome, jogo);
        cd.setNome(nome);
        cd.setPreco(valor);
        cd.setnMusicas(jogo);
        
        
        cd.printDados();
       
      
    }
    
    
   
}