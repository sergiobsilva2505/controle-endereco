package br.com.sbs.addresscontrol.service;

import br.com.sbs.addresscontrol.entities.Usuario;
import br.com.sbs.addresscontrol.exception.UsuarioNotFoundException;
import br.com.sbs.addresscontrol.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario insert(Usuario obj){
        Usuario usuario = usuarioRepository.save(obj);
        return usuario;
    }

    public Usuario findById(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElseThrow(()-> new UsuarioNotFoundException(
                "Objeto não encontrado. - Id: "+ id +", Tipo: " + (Usuario.class.getName()))
        );
    }
}
