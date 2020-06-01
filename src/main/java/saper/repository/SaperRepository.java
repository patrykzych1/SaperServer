package saper.repository;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import saper.dto.ScoreDto;
import saper.entity.Score;
import org.springframework.data.repository.query.Param;
import java.util.List;

@Repository
public interface SaperRepository extends JpaRepository<Score, Long>, CrudRepository<Score, Long> {
    @Query("SELECT s FROM Score s WHERE s.difficultyLevel = :difficultyLevel ORDER BY s.time")
    List<Score> findAllByDifficultyLevel(@Param("difficultyLevel") String difficultyLevel);
}
