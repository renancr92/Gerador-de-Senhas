package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

    public static String gerarSenha() {

        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";

        Random random = new Random();

        String senha = "";

        for (int i = 0; i < 4; i++) {
            int posicao = random.nextInt(letras.length());
            senha += letras.charAt(posicao);
        }

        for (int i = 0; i < 2; i++) {
            int posicao = random.nextInt(numeros.length());
            senha += numeros.charAt(posicao);
        }

        return senha;
    }

    public static void main(String[] args) {
        System.out.println(gerarSenha());
    }
}//j