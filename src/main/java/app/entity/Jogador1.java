package app.entity;

//import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
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
    @Column(name="idJogador1") //Nome do campo no banco de dados
    //Long é comumente usado para chaves primárias (PKs)
    private Long idJogador1;
    
    @NotNull(message = "Nome não pode ser nulo")
    @Column(length = 40)
    private String nome;
    
    @PastOrPresent // Garante que a data não seja no futuro 
    @JsonFormat(pattern = "dd/MM/yyyy") // Formata a data na saída JSON 
    // Melhor prática em Java é Camel Case, como está abaixo.
    private LocalDate dataNascimento;
       
    @Column(length = 30)
    private String nacionalidade;
    
    @Column(precision = 3, scale = 2) // Define 3 dígitos no total + 2 após a vírgula
    private BigDecimal altura; // Uso recomendado para precisão
    
    @Column(precision = 3, scale = 0)
    private BigDecimal pesoKg;

    @Column(length = 30)
    private String posicao; //goleiro , zagueiro.. etc..
    
    @Column(length = 30)
    private String conhecidoComo;
    
    private Integer numeroUniforme;
    
    private Integer overall;
    
    @Lob 
    private byte[] fotoJogador1;

	
    
    
    //Getters and Setters
    public Long getIdJogador1() {
		return idJogador1;
	}

	public void setIdJogador1(Long idJogador1) {
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

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(BigDecimal pesoKg) {
		this.pesoKg = pesoKg;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getConhecidoComo() {
		return conhecidoComo;
	}

	public void setConhecidoComo(String conhecidoComo) {
		this.conhecidoComo = conhecidoComo;
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
 
   
    
