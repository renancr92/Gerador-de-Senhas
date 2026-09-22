package gerenciadorDeSenhas;

import java.util.Random;

public class Geradorsenha {

	public static String gerarLetra(Random random) {
	    String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	    return String.valueOf(letras.charAt(random.nextInt(letras.length())));
	}

	public static String gerarNumero(Random random) {
	    String numeros = "0123456789";
	    return String.valueOf(numeros.charAt(random.nextInt(numeros.length())));
	}

	public static String gerarEspecial(Random random) {
	    String especiais = "@#$%&*!";
	    return String.valueOf(especiais.charAt(random.nextInt(especiais.length())));
	}

	public static String gerarCaractere(Random random) {
	    String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*!";
	    return String.valueOf(caracteres.charAt(random.nextInt(caracteres.length())));
	}

	public static String gerarSenha(int tamanho) {

	    if (tamanho < 3) {
	        return "O tamanho deve ser no mínimo 3";
	    }

	    Random random = new Random();

	    String senha = "";

	    senha += gerarLetra(random);
	    senha += gerarNumero(random);
	    senha += gerarEspecial(random);

	    for (int i = 3; i < tamanho; i++) {
	        senha += gerarCaractere(random);
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
	    System.out.println(gerarSenha(10));
	}
}