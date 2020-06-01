package saper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import saper.entity.Score;

@Repository
public interface SaperRepository extends JpaRepository<Score, Long>, CrudRepository<Score, Long> {
}
