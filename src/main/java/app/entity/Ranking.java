package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.persistence.ManyToOne;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ranking")

public class Ranking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPontuacao;
    
    private Integer valorPontuacao;
    
    @PastOrPresent // Garante que a data não seja no futuro 
    @JsonFormat(pattern = "dd/MM/yyyy") // Formata a data na saída JSON 
    private LocalDate dataPontuacao;
    
    
    //Um Palpite de pontuação só pertence a 1 usuário
    //e um usuário pode ter vários palpites de pontuação.
    @ManyToOne //cascade = ALL em ManyToOne → armadilha clássica
    private Usuario usuario;

    
    
    //Getters and Setters
	public Integer getIdPontuacao() {
		return idPontuacao;
	}


	public void setIdPontuacao(Integer idPontuacao) {
		this.idPontuacao = idPontuacao;
	}


	public Integer getValorPontuacao() {
		return valorPontuacao;
	}


	public void setValorPontuacao(Integer valorPontuacao) {
		this.valorPontuacao = valorPontuacao;
	}


	public LocalDate getDataPontuacao() {
		return dataPontuacao;
	}


	public void setDataPontuacao(LocalDate dataPontuacao) {
		this.dataPontuacao = dataPontuacao;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
    
    
    
    
    


}
