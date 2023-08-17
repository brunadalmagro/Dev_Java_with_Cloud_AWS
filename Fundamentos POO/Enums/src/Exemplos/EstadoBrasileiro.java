package Exemplos;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
    ACRE ("AC", "Acre", 12),
    ALAGOAS ("AL", "Alagoas", 27),
    AMAPA ("AP", "Amapá", 16),
    AMAZONAS ("AM", "Amazonas", 13),
    BAHIA ("BA", "Bahia", 29),
    CEARA ("CE", "Ceará", 23),
    DISTRITO_FEDERAL ("DF", "Distrito Federal", 53),
    ESPIRITO_SANTO ("ES", "Espírito Santo", 32),
    GOIAS ("GO", "Goiás", 52),
    MARANHAO ("MA", "Maranhão", 21),
    MATO_GROSSO ("MT", "Mato Grosso", 51),
    MATO_GROSSO_SUL ("MS", "Mato Grosso do Sul", 50),
    MINAS_GERAIS ("MG", "Minas Gerais", 31),
    PARA ("PA", "Pará", 15),
    PARAIBA ("PB", "Paraíba", 25),
    PARANA ("PR", "Paraná", 41),
    PERNAMBUCO ("PE", "Pernambuco", 26),
    PIAUI ("PI", "Piauí", 22),
    RIO_GRANDE_NORTE ("RN", "Rio Grande do Norte", 24),
    RIO_GRANDE_SUL ("RS", "Rio Grande do Sul", 43),
    RONDONIA ("RO", "Rondônia", 11),
    RORAIMA ("RR", "Roraima", 14),
    SANTA_CATARINA ("SC", "Santa Catarina", 42),
    SAO_PAULO ("SP", "São Paulo", 35),
    SERGIPE ("SE", "Sergipe", 28),
    TOCANTINS ("TO", "Tocantins", 17);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}