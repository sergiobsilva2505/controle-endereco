package br.com.sbs.addresscontrol.dto;

import br.com.sbs.addresscontrol.entities.Usuario;

import java.time.LocalDate;

public class UsuarioResponseDTO {

    private Integer id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dtNascimento;

    public UsuarioResponseDTO(Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
