package app.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.OneToMany;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull(message = "Nome não pode ser nulo")
    @Column(length = 30)
    private String nomeUsuario;

    @OneToMany(mappedBy = "usuario")
    private List<Ranking> ranking;
    
    
    
    //Getters and Setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public List<Ranking> getRanking() {
		return ranking;
	}

	public void setRanking(List<Ranking> ranking) {
		this.ranking = ranking;
	}
	
	
	
    
      
    
    
    
    
}
    
    