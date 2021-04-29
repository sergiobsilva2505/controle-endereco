package br.com.sbs.addresscontrol.controller;

import br.com.sbs.addresscontrol.UsuarioService;
import br.com.sbs.addresscontrol.dto.UsuarioDTO;
import br.com.sbs.addresscontrol.dto.NewUsuarioResponseDTO;
import br.com.sbs.addresscontrol.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;

@RestController
@RequestMapping(value = "/usuario")
@Transactional
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<NewUsuarioResponseDTO> insertUsuario(@RequestBody UsuarioDTO obj){
        Usuario usuario = usuarioService.insert(UsuarioDTO.toUsuario(obj));
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new NewUsuarioResponseDTO(usuario));
    }
}
