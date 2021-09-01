package programa;

import atirador.Arma;
import atirador.Personagem;


public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Arma pistola = new Arma(1,90,200,10);
		
		pistola.setPotencia(50);
		
		Personagem p1 = new Personagem("Atirador");
		
		p1.atirar(45, pistola);
    System.out.println("Quantidade de tiros antes da recarga: "+ pistola.getQtdTiros());
		p1.comprarTiros((float)5, pistola);
    p1.atirar(45, pistola);
		//System.out.println("Qtd tiros: " + pistola.getQtdTiros());
		//System.out.println("Potência: " + pistola.getPotencia() + "mm");
		//System.out.println("Velocidade: " + pistola.getVelocidade() + "m/s");
    }
    
}
