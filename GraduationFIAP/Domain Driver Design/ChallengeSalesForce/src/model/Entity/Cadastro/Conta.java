package model.Entity.Cadastro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Conta {

    private Long id;
    private String usuario;
    private String email;
    private String senha;
    private LocalDate dataRegistro;
    private LocalDateTime ultimoAcesso;

    public Conta(String usuario, String email, String senha) {
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
        this.dataRegistro = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(LocalDateTime ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(usuario, conta.usuario) && Objects.equals(email, conta.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, email);
    }

    @Override
    public String toString() {
        return "Conta " + "\n\n" +
                "Id: "+ id + "\n" +
                "Usuario: "+ usuario + "\n" +
                "Email: " + email + "\n" +
                "Senha: " + senha;
    }
}
