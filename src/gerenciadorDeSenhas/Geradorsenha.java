package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

    public static String gerarSenha() {

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        Random random = new Random();

        String senha = "";

        for (int i = 0; i < 6; i++) {
            int posicao = random.nextInt(letras.length());
            senha += letras.charAt(posicao);
        }

        return senha;
    }

    public static void main(String[] args) {
        System.out.println(gerarSenha());
    }
}