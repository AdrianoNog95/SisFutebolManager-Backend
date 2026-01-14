package app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import app.entity.Ranking;
import app.repository.RankingRepository;


@Service
public class RankingService {

	@Autowired
    private RankingRepository rankingRepository;
    
    public String save(Ranking ranking) {
        this.rankingRepository.save(ranking);        
        return "Salvo com sucesso!";
    }
    
    
    public String update(Integer idPontuacao, Ranking ranking) {
        ranking.setIdPontuacao(idPontuacao);
        this.rankingRepository.save(ranking);        
        return "Atualizado com sucesso!";
    }
    
    
    public List<Ranking> listAll(){
        return this.rankingRepository.findAll();
    }
    
    
    public Ranking findById(Integer idPontuacao) {
        Ranking ranking = this.rankingRepository.findById(idPontuacao).get();
        return ranking;
    }
    
        
    public String delete(Integer idPontuacao) {
        this.rankingRepository.deleteById(idPontuacao);        
        return "Deletado com sucesso!";
    }    
    
    
    
      
    
    
    
}

