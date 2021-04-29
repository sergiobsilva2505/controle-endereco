package br.com.sbs.addresscontrol;

import br.com.sbs.addresscontrol.entities.Usuario;
import br.com.sbs.addresscontrol.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario insert(Usuario obj){
        Usuario usuario = usuarioRepository.save(obj);
        return usuario;
    }
}
