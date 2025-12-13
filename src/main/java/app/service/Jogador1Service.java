package app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import app.entity.Jogador1;
import app.repository.Jogador1Repository;


@Service
public class Jogador1Service {

	@Autowired
    private Jogador1Repository jogador1Repository;
    
    public String save(Jogador1 jogador1) {
        this.jogador1Repository.save(jogador1);        
        return jogador1.getNome()+ " salvo com sucesso!";
    }
    
    
    public String update(long idJogador1, Jogador1 jogador1) {
        jogador1.setIdJogador1(idJogador1);
        this.jogador1Repository.save(jogador1);        
        return jogador1.getNome()+ " atualizado com sucesso!";
    }
    
    
    public List<Jogador1> listAll(){
        return this.jogador1Repository.findAll();
    }
    
    
    public Jogador1 findById(long idJogador1) {
        Jogador1 jogador1 = this.jogador1Repository.findById(idJogador1).get();
        return jogador1;
    }
    
        
    public String delete(long idJogador1) {
        this.jogador1Repository.deleteById(idJogador1);        
        return " deletado com sucesso!";
    }    
    
    
    
      
    
    
    
}

