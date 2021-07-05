package br.com.model.calculamais;

public class Usuario {
    private String usuario;
    private Long id;
    private String senha;
    
    public Usuario(long id, String usuario, String senha){
        this.usuario = usuario;
        this.id = id;
        this.senha = senha;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public Long getId() {
        return id;
    }

    public String getSenha() {
        return senha;
    }
    
    
}
