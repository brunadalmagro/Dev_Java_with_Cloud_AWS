package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinha;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha();

        //ações que estabelecimento precisa ter ciência
        cozinha.adicionarSucoNoBalcao();
        ;
        cozinha.adicionarLancheNoBalcao();
        cozinha.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}