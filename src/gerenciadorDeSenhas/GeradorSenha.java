package gerenciadorDeSenhas;

import java.security.SecureRandom;

public class GeradorSenha {

    private static final String LETRAS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final String NUMEROS =
            "0123456789";

    private static final String ESPECIAIS =
            "!@#$%&*";

    private static final String CARACTERES =
            LETRAS + NUMEROS + ESPECIAIS;

    private static final SecureRandom random = new SecureRandom();

    public static String gerar(int tamanho) {

        if (tamanho < 3) {
            throw new IllegalArgumentException(
                "O tamanho deve ser no mínimo 3"
            );
        }

        StringBuilder senha = new StringBuilder();

        senha.append(LETRAS.charAt(random.nextInt(LETRAS.length())));
        senha.append(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
        senha.append(ESPECIAIS.charAt(random.nextInt(ESPECIAIS.length())));

        for (int i = 3; i < tamanho; i++) {
            senha.append(
                CARACTERES.charAt(random.nextInt(CARACTERES.length()))
            );
        }

        char[] caracteres = senha.toString().toCharArray();

        for (int i = caracteres.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
        }

        return new String(caracteres);
    }
}