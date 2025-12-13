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

import app.entity.Jogador1;
import app.service.Jogador1Service;

@RestController
@RequestMapping("/api/jogador1")
public class Jogador1Controller {

    @Autowired
    private Jogador1Service jogador1Service;
    
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Jogador1 jogador1) {
        try {
            String mensagem = this.jogador1Service.save(jogador1);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    @PutMapping("/update/{idJogador1}")
    public ResponseEntity<String> update(@RequestBody Jogador1 jogador1, @PathVariable long idJogador1) {
        try {
            String mensagem = this.jogador1Service.update(idJogador1, jogador1);
            return new ResponseEntity<String>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/listAll")
    public ResponseEntity<List<Jogador1>> listAll(){
        try {
            List<Jogador1> lista = this.jogador1Service.listAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @GetMapping("/findById/{idJogador1}")
    public ResponseEntity<Jogador1> findById(@PathVariable long idJogador1) { 
        try {
            Jogador1 jogador1 = this.jogador1Service.findById(idJogador1);
            return new ResponseEntity<>(jogador1, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
       
    @DeleteMapping("/delete/{idJogador1}")
    public ResponseEntity<String> delete (@PathVariable long idJogador1) {
        try {
            String mensagem = this.jogador1Service.delete(idJogador1);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    
      
}  
    