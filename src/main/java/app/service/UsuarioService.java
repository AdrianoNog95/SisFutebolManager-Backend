package app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import app.entity.Usuario;
import app.repository.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
    private UsuarioRepository usuarioRepository;
    
    public String save(Usuario usuario) {
        this.usuarioRepository.save(usuario);        
        return "Dados salvos com sucesso!";
    }
    
    
    public String update(Integer id, Usuario usuario) {
        usuario.setId(id);
        this.usuarioRepository.save(usuario);        
        return "Dados atualizados com sucesso!";
    }
    
    
    public List<Usuario> listAll(){
        return this.usuarioRepository.findAll();
    }
    
    
    public Usuario findById(Integer id) {
        Usuario usuario = this.usuarioRepository.findById(id).get();
        return usuario;
    }
    
        
    public String delete(Integer id) {
        this.usuarioRepository.deleteById(id);        
        return "Dados deletados com sucesso!";
    }    
    
    
    
      
    
    
    
}

