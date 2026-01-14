package app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import app.entity.Time;
import app.repository.TimeRepository;


@Service
public class TimeService {

	@Autowired
    private TimeRepository timeRepository;
    
    public String save(Time time) {
        this.timeRepository.save(time);        
        return time.getNome()+ " salvo com sucesso!";
    }
    
    
    public String update(Integer id, Time time) {
        time.setId(id);
        this.timeRepository.save(time);        
        return time.getNome()+ " atualizado com sucesso!";
    }
    
    
    public List<Time> listAll(){
        return this.timeRepository.findAll();
    }
    
    
    public Time findById(Integer id) {
        Time time = this.timeRepository.findById(id).get();
        return time;
    }
    
        
    public String delete(Integer id) {
        this.timeRepository.deleteById(id);        
        return " deletado com sucesso!";
    }    
    
    
    
      
    
    
    
}

