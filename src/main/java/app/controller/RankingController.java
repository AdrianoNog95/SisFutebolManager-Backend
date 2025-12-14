package app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Ranking;
import app.service.RankingService;

@RestController
@RequestMapping("/api/ranking")
public class RankingController {

    @Autowired
    private RankingService rankingService;
    
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Ranking ranking) {
        try {
            String mensagem = this.rankingService.save(ranking);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    @PutMapping("/update/{idPontuacao}")
    public ResponseEntity<String> update(@RequestBody Ranking ranking, @PathVariable long idPontuacao) {
        try {
            String mensagem = this.rankingService.update(idPontuacao, ranking);
            return new ResponseEntity<String>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/listAll")
    public ResponseEntity<List<Ranking>> listAll(){
        try {
            List<Ranking> lista = this.rankingService.listAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @GetMapping("/findById/{idPontuacao}")
    public ResponseEntity<Ranking> findById(@PathVariable long idPontuacao) { 
        try {
            Ranking ranking = this.rankingService.findById(idPontuacao);
            return new ResponseEntity<>(ranking, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
       
    @DeleteMapping("/delete/{idPontuacao}")
    public ResponseEntity<String> delete (@PathVariable long idPontuacao) {
        try {
            String mensagem = this.rankingService.delete(idPontuacao);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    
      
}  
    