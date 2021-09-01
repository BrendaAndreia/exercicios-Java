package Implementação;

public class Motorista {
    public String nome;
    public BitMap foto;
    public String contato;
    private String cnh;
    protected String modeloCarro;
    protected String placaCarro;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void iniciarExpediente(){
        System.out.println("Bem vindo," + this.nome + ", tenha boas viagens!");

    }
    public void aceitarCorrida(){
        
        aceitarCorrida();//codigo
        
    }
    public void cancelarCorrida(){
        System.out.println("Corrida cancelada.");

    }
    public void finalizarCorrida(){
        System.out.println("Corrida finalizada.");

    }
}