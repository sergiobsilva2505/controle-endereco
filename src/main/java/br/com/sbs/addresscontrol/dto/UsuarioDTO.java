package br.com.sbs.addresscontrol.dto;

import br.com.sbs.addresscontrol.entities.Usuario;

import java.time.LocalDate;

public class UsuarioDTO {

    private String nome;
    private String email;
    private String cpf;
    private LocalDate dtNascimento;

    public UsuarioDTO() {
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

    public static Usuario toUsuario(UsuarioDTO dto){
        Usuario obj = new Usuario(
                dto.getNome(),
                dto.getCpf(),
                dto.getEmail(),
                dto.getDtNascimento()
        );
        return obj;
    }
}
