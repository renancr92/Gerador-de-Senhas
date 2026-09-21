package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

	public static String gerarSenha(int tamanho) {

	    String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    String numeros = "0123456789";
	    String especiais = "@#$%&*!";

	    Random random = new Random();

	    String senha = "";

	    senha += letras.charAt(random.nextInt(letras.length()));
	    senha += numeros.charAt(random.nextInt(numeros.length()));
	    senha += especiais.charAt(random.nextInt(especiais.length()));

	    String caracteres = letras + numeros + especiais;

	    for (int i = 3; i < tamanho; i++) {
	        int posicao = random.nextInt(caracteres.length());
	        senha += caracteres.charAt(posicao);
	    }

	    return senha;
	}

	public static void main(String[] args) {
	    System.out.println(gerarSenha(10));
	}
}