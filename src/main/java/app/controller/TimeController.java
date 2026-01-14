package app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Time;
import app.service.TimeService;

@RestController
@RequestMapping("/api/time")
public class TimeController {

    @Autowired
    private TimeService timeService;
    
    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Time time) {
        try {
            String mensagem = this.timeService.save(time);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@RequestBody Time time, @PathVariable Integer id) {
        try {
            String mensagem = this.timeService.update(id, time);
            return new ResponseEntity<String>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    @GetMapping("/listAll")
    public ResponseEntity<List<Time>> listAll(){
        try {
            List<Time> lista = this.timeService.listAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Time> findById(@PathVariable Integer id) { 
        try {
            Time time = this.timeService.findById(id);
            return new ResponseEntity<>(time, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
    
       
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete (@PathVariable Integer id) {
        try {
            String mensagem = this.timeService.delete(id);
            return new ResponseEntity<>(mensagem, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }  
    }
    
    
    
      
}  





