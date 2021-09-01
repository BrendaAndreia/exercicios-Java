package atirador;

public class Personagem {
    public String nome;
    public int tamanho;
    public String cor;
    public float dinheiro;

    public Personagem(String nome) {
		this.nome = nome;
    }
    public void atirar(float angulo, Arma a) {
		
	a.disparar(angulo);
    }
    public void comprarTiros(float dinheiro, Arma a) {
            
       int tiros = (int) (dinheiro /a.getCustoPorTiro());
       a.recarregar(tiros, this);
       dinheiro = dinheiro - tiros* a.getCustoPorTiro();
       System.out.println("Dinheiro restante: " +dinheiro);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }   
}
