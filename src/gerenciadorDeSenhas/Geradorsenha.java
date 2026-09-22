package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

	public static String gerarSenha(int tamanho) {

	    if (tamanho < 3) {
	        return "O tamanho deve ser no mínimo 3";
	    }

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

	    char[] senhaArray = senha.toCharArray();

	    for (int i = senhaArray.length - 1; i > 0; i--) {
	        int j = random.nextInt(i + 1);

	        char temp = senhaArray[i];
	        senhaArray[i] = senhaArray[j];
	        senhaArray[j] = temp;
	    }

	    return new String(senhaArray);
	}

	public static void main(String[] args) {
	    System.out.println(gerarSenha(2));
	    System.out.println(gerarSenha(10));
	}
}