package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import jakarta.validation.constraints.PastOrPresent;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Lob;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jogador1")

public class Jogador1 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJogador1;
    
    @NotNull(message = "Nome não pode ser nulo")
    @Column(length = 40)
    private String nome;
    
    @PastOrPresent // Garante que a data não seja no futuro 
    @JsonFormat(pattern = "dd/MM/yyyy") // Formata a data na saída JSON 
    // Melhor prática em Java é Camel Case, como está abaixo.
    private LocalDate dataNascimento;
       
    @Column(length = 30)
    private String pais;
    
    @Column(length = 30)
    private String posicao; //goleiro , zagueiro.. etc..
    
    private Integer numeroUniforme;
    
    private Integer overall;
    
    @Lob 
    private byte[] fotoJogador1;

	
    
    
    //Getters and Setters
    public Integer getIdJogador1() {
		return idJogador1;
	}

	public void setIdJogador1(Integer idJogador1) {
		this.idJogador1 = idJogador1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getNumeroUniforme() {
		return numeroUniforme;
	}

	public void setNumeroUniforme(Integer numeroUniforme) {
		this.numeroUniforme = numeroUniforme;
	}

	public Integer getOverall() {
		return overall;
	}

	public void setOverall(Integer overall) {
		this.overall = overall;
	}

	public byte[] getFotoJogador1() {
		return fotoJogador1;
	}

	public void setFotoJogador1(byte[] fotoJogador1) {
		this.fotoJogador1 = fotoJogador1;
	}
    
    
    
    
    
 

}
 
   
    
