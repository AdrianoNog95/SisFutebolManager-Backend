package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.entity.Jogador1;
import java.util.List;

public interface Jogador1Repository extends JpaRepository<Jogador1, Integer> {
	List<Jogador1> findByPosicaoIgnoreCase(String posicao);
}