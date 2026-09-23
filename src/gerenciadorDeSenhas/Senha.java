package gerenciadorDeSenhas;

public class Senha {
 
    private String servico;
    private String usuario;
    private String senha;
 
    public Senha(String servico, String usuario, String senha) {
        if (servico == null || servico.isBlank()) {
            throw new IllegalArgumentException("O serviço não pode ser vazio.");
        }
        if (usuario == null || usuario.isBlank()) {
            throw new IllegalArgumentException("O usuário não pode ser vazio.");
        }
        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("A senha não pode ser vazia.");
        }
 
        this.servico = servico;
        this.usuario = usuario;
        this.senha = senha;
    }
 
    public String getServico() {
        return servico;
    }
 
    public void setServico(String servico) {
        this.servico = servico;
    }
 
    public String getUsuario() {
        return usuario;
    }
 
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
 
    public String getSenha() {
        return senha;
    }
 
    public void setSenha(String senha) {
        this.senha = senha;
    }
 
    @Override
    public String toString() {
        return "Serviço: " + servico + " | Usuário: " + usuario + " | Senha: " + senha;
    }
}

