package br.com.sbs.addresscontrol.dto;

import br.com.sbs.addresscontrol.entities.Usuario;

import java.time.LocalDate;

public class UsuarioResponseDTO {

    private Integer id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dateOfBirth;

    public UsuarioResponseDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();;
        this.cpf = usuario.getCpf();
        this.dateOfBirth = usuario.getDtNascimento();
    }


    /*
    private List<AddressResponseDTO> toAddressDTO(List<Address> list){
        List<AddressResponseDTO> dtoList = new ArrayList<>();
        list.stream().forEach(address -> {
            dtoList.add(new AddressResponseDTO(address));
        });
        return dtoList;
    }*/

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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
