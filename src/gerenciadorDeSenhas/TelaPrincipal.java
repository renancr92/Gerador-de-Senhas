package gerenciadorDeSenhas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TelaPrincipal {

    private TextField txtServico;
    private TextField txtUsuario;
    private TextField txtSenha;
    private TableView<Senha> tabela;
    private ObservableList<Senha> listaSenhas;

    public Parent criarTela() {
        listaSenhas = FXCollections.observableArrayList();

        // Layout Principal
        VBox root = new VBox(15);
        root.setPadding(new Insets(20));

        // Título
        Label lblTitulo = new Label("GERENCIADOR DE SENHAS");
        lblTitulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        // Formulário de Entrada
        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(10);

        Label lblServico = new Label("Serviço:");
        txtServico = new TextField();

        Label lblUsuario = new Label("Usuário:");
        txtUsuario = new TextField();

        Label lblSenha = new Label("Senha:");
        txtSenha = new TextField();

        Button btnGerarSenha = new Button("Gerar Senha");

        formGrid.add(lblServico, 0, 0);
        formGrid.add(txtServico, 1, 0);
        formGrid.add(lblUsuario, 0, 1);
        formGrid.add(txtUsuario, 1, 1);
        formGrid.add(lblSenha, 0, 2);
        formGrid.add(txtSenha, 1, 2);
        formGrid.add(btnGerarSenha, 2, 2);

        // Botoes de Acao
        Button btnCadastrar = new Button("Cadastrar");
        Button btnEditar = new Button("Editar");
        Button btnExcluir = new Button("Excluir");

        HBox boxBotoes = new HBox(10, btnCadastrar, btnEditar, btnExcluir);
        boxBotoes.setAlignment(Pos.CENTER_LEFT);

        // Tabela de Exibicao
        tabela = new TableView<>();
        
        TableColumn<Senha, String> colServico = new TableColumn<>("Serviço");
        colServico.setCellValueFactory(new PropertyValueFactory<>("servico"));

        TableColumn<Senha, String> colUsuario = new TableColumn<>("Usuário");
        colUsuario.setCellValueFactory(new PropertyValueFactory<>("usuario"));

        TableColumn<Senha, String> colSenha = new TableColumn<>("Senha");
        colSenha.setCellValueFactory(new PropertyValueFactory<>("senha"));

        tabela.getColumns().addAll(colServico, colUsuario, colSenha);
        tabela.setItems(listaSenhas);
       tabela.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        // Ações dos Botões

        // Gerar Senha
        btnGerarSenha.setOnAction(e -> {
            String senhaGerada = GeradorSenha.gerar(12);
            txtSenha.setText(senhaGerada);
        });

        // Cadastrar
        btnCadastrar.setOnAction(e -> {
            String servico = txtServico.getText();
            String usuario = txtUsuario.getText();
            String senha = txtSenha.getText();

            if (!servico.isBlank() && !usuario.isBlank() && !senha.isBlank()) {
                Senha novaSenha = new Senha(servico, usuario, senha);
                listaSenhas.add(novaSenha);
                limparCampos();
            } else {
                mostrarAlerta("Aviso", "Preencha todos os campos para cadastrar.");
            }
        });

        // Editar
        btnEditar.setOnAction(e -> {
            Senha selecionada = tabela.getSelectionModel().getSelectedItem();
            if (selecionada != null) {
                if (!txtServico.getText().isBlank() && !txtUsuario.getText().isBlank() && !txtSenha.getText().isBlank()) {
                    selecionada.setServico(txtServico.getText());
                    selecionada.setUsuario(txtUsuario.getText());
                    selecionada.setSenha(txtSenha.getText());
                    tabela.refresh();
                    limparCampos();
                } else {
                    mostrarAlerta("Aviso", "Preencha todos os campos para editar.");
                }
            } else {
                mostrarAlerta("Aviso", "Selecione uma linha da tabela para editar.");
            }
        });

        // Excluir
        btnExcluir.setOnAction(e -> {
            Senha selecionada = tabela.getSelectionModel().getSelectedItem();
            if (selecionada != null) {
                listaSenhas.remove(selecionada);
                limparCampos();
            } else {
                mostrarAlerta("Aviso", "Selecione uma linha da tabela para excluir.");
            }
        });

        // Evento de Selecao na Tabela (Preenche os campos)
        tabela.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                txtServico.setText(newSelection.getServico());
                txtUsuario.setText(newSelection.getUsuario());
                txtSenha.setText(newSelection.getSenha());
            }
        });

        root.getChildren().addAll(lblTitulo, formGrid, boxBotoes, tabela);
        return root;
    }

    private void limparCampos() {
        txtServico.clear();
        txtUsuario.clear();
        txtSenha.clear();
        tabela.getSelectionModel().clearSelection();
    }

    private void mostrarAlerta(String titulo, String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}