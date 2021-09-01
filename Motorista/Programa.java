package Implementação;
public class Programa {
	
    public static void main(String[] args) {

        Motorista novoMotorista =  new  Motorista();
        novoMotorista.setNome("Bruna");

        novoMotorista.iniciarExpediente();
        novoMotorista.aceitarCorrida();
        novoMotorista.cancelarCorrida();
        novoMotorista.finalizarCorrida();

        Usuario novoUsuario  =  new Usuario();
        novoUsuario.setNome("Carlos");
        novoUsuario.setCpf("75021548965");
        novoUsuario.solicitarCorrida();
        novoUsuario.cancelarCorrida();
        
    }
}