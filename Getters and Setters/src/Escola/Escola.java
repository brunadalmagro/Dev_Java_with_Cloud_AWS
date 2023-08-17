package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        // Definir
        felipe.setIdade(17);
        felipe.setNome("Felipe Jose");

        // Obter
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        //RESULTADO NO CONSOLE
    }
}
