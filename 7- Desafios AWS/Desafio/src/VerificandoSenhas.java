import java.util.Scanner;
import java.util.regex.Pattern;

public class VerificandoSenhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        // TODO: Verifique o comprimento mínimo e critérios de validação
        if (senha.length() < comprimentoMinimo) {
            return "A senha deve ter pelo menos " + comprimentoMinimo + " caracteres.";
        }

        // Verificando os critérios de validação
        if (!temLetraMaiuscula) {
            return "A senha deve conter pelo menos uma letra maiúscula.";}
        if (!temLetraMinuscula) {
            return "A senha deve conter pelo menos uma letra minúscula.";}
        if (!temNumero) {
            return "A senha deve conter pelo menos um número.";}
        if (!temCaractereEspecial) {
            return "A senha deve conter pelo menos um caractere especial.";}
        if (temSequenciaComum) {
            return "A senha não pode conter sequências comuns.";}
        if (temPalavraComum) {
            return "A senha não pode ser uma senha comum.";}

        // Se a senha passar por todas as verificações, é considerada forte
        return "A senha é forte.";
    }
}