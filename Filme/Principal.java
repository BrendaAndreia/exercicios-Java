
package encapsulamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
            ArrayList<Filme> FilmeList = new ArrayList<Filme>(); 
            
         int codigo = 0; 
         int contador =0;
        do{
            
            Filme filme = new Filme("Teste",123);
                       
            System.out.print("Digite o codigo do filme: ");
            codigo = (Integer.parseInt(sc.nextLine()));
            if(codigo!=0){
                filme.setCodigo(codigo);            
                codigo = filme.getCodigo();     
                System.out.print("Digite o nome do filme: ");
                filme.setNome(sc.nextLine());
                        
                System.out.print("Digite o genero do filme: ");
                filme.setGenero(sc.nextLine());
            
                System.out.print("Digite o autor do filme: ");
                filme.setAutor(sc.nextLine());
            
                System.out.print("Digite o ano do filme: ");
                filme.setAno(Integer.parseInt(sc.nextLine()));
                                  
                FilmeList.add(filme);
                Filme.TotalFilmes();
                
            }
        }while(codigo!=0);
        
       
        sc.close();
        System.out.println(FilmeList);
        int total = Filme.getTotalDeFilmes();
        System.out.println("Total de filmes criados: "+total);
    }
}