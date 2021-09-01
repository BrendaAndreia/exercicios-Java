
package encapsulamento;


public class Filme {
    
    private int codigo;
    private String nome;
    private String genero;
    private String autor;
    private int ano;
    
     public Filme(String nome, int codigo) {
        
       this.nome = nome;
       this.codigo = codigo;
    }

    public static int totalDeFilmes = 0;

    public static int TotalFilmes() {
        
        Filme.totalDeFilmes = Filme.totalDeFilmes + 1;
        return 0;
    }
    public static int getTotalDeFilmes() {
        return Filme.totalDeFilmes;
    } 
    
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    @Override
    public String toString(){
    
        return String.format("\nNome: %s\nCodigo: %s\nGenero: %s\nAutor:"
                + " %s\nAno: %s\n", nome,codigo,genero,autor,ano);
    
    }   
}
