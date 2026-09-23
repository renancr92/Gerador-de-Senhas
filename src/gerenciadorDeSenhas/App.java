package gerenciadorDeSenhas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        Scene scene = new Scene(telaPrincipal.criarTela(), 600, 450);

        // Tenta carregar o ficheiro CSS de estilos se estiver presente na pasta de recursos
        try {
            if (getClass().getResource("/css/style.css") != null) {
                scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());
            } else if (getClass().getResource("/resources/css/style.css") != null) {
                scene.getStylesheets().add(getClass().getResource("/resources/css/style.css").toExternalForm());
            }
        } catch (Exception e) {
            System.out.println("Aviso: Não foi possível carregar a folha de estilo CSS.");
        }

        primaryStage.setTitle("Gerenciador de Senhas");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
