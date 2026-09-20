package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

    public static String gerarSenha() {

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Random random = new Random();

        int posicao = random.nextInt(letras.length());

        return String.valueOf(letras.charAt(posicao));
    }

    public static void main(String[] args) {
        System.out.println(gerarSenha());
    }
}
