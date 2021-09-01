package Implementação;

public class Usuario {
    public String nome;
    public BitMap foto;
    public String contato;
    private String cpf;
    private String dadosCartao;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void solicitarCorrida(){
        
       //codigo
        
    }
    public void cancelarCorrida(){
        System.out.println("Corrida cancelada.");

    }
    public void avaliarMotorista(){
        System.out.println("Atribua uma nota para o motorista.");

    }
    public void alterarPagamento(){
        System.out.println("Selecione a forma de pagamento:");

    }

}
