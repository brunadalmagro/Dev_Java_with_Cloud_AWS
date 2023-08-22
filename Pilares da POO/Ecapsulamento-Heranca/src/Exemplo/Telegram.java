package Exemplo;

public class Telegram {
        public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Eviando mensagem pelo Telegram Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram Messenger");
    }
    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
        //+30
    }
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
