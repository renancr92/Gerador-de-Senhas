package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

	public static String gerarSenha() {

	    String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    String numeros = "0123456789";
	    String especiais = "@#$%&*!";

	    String caracteres = letras + numeros + especiais;

	    Random random = new Random();

	    String senha = "";

	    for (int i = 0; i < 6; i++) {
	        int posicao = random.nextInt(caracteres.length());
	        senha += caracteres.charAt(posicao);
	    }

	    return senha;
	}

    public static void main(String[] args) {
        System.out.println(gerarSenha());
    }
}