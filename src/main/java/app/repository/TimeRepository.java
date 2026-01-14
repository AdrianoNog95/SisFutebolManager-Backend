package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Time;

public interface TimeRepository extends JpaRepository<Time, Integer> {
	
}
