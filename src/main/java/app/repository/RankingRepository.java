package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Ranking;

public interface RankingRepository extends JpaRepository<Ranking, Long> {
	
}
