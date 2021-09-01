package atirador;

public class Arma {
    
    private int qtdTiros;
    private int potencia;
    private int velocidade;
    private float custoPorTiro;

    public Arma(int qtdTiros, int potencia, int velocidade, float custoPorTiro) {
	
        this.setQtdTiros(qtdTiros);
	this.setPotencia(potencia);
	this.setVelocidade(velocidade);
        this.setCustoPorTiro(custoPorTiro);
    }
    
    public void disparar(float angulo) {
	if(qtdTiros>0){
             
            this.qtdTiros = qtdTiros - 1;    
            System.out.println("Disparando no ângulo " + angulo + " e Potência " +  potencia);
            
        
        }
        else{
           System.out.println("Arma descarregada"); 
        }
    }
    public void recarregar(int tiros, Personagem p) {
    
        
        this.qtdTiros = qtdTiros + tiros;
        System.out.println("Quantidade de tiros recarregados: "+ tiros);
        System.out.println("Quantidade de tiros disponiveis: "+ qtdTiros);
        
    }
    public int getQtdTiros() {
        return this.qtdTiros;
    }

    public void setQtdTiros(int qtdTiros) {
        this.qtdTiros = qtdTiros;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public float getCustoPorTiro() {
        return custoPorTiro;
    }

    public void setCustoPorTiro(float custoPorTiro) {
        this.custoPorTiro = custoPorTiro;
    }
}
