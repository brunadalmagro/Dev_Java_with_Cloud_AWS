package Exemplo;

import Exemplo.FacebookMessenger;
import Exemplo.Telegram;
import Exemplo.MSNMessenger;

/*
 * Simulação do uso das classes
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

    FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagem();

    Telegram tlg = new Telegram();

        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}