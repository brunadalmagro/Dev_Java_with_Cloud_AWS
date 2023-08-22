package Exemplo;

public class FacebookMessenger {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Eviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
        //+30
    }
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}