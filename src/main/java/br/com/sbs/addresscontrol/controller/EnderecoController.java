package br.com.sbs.addresscontrol.controller;

import br.com.sbs.addresscontrol.dto.EnderecoResponseDTO;
import br.com.sbs.addresscontrol.dto.NovoEnderecoDTO;
import br.com.sbs.addresscontrol.entities.Endereco;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @PostMapping
    public ResponseEntity<EnderecoResponseDTO> insertEndereco(@RequestBody NovoEnderecoDTO dto){

        Endereco obj = new Endereco();
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(new EnderecoResponseDTO(obj));
    }

}
