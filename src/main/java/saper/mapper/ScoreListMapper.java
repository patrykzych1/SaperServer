package saper.mapper;

import org.springframework.stereotype.Component;
import saper.dto.ScoreDto;
import saper.entity.Score;

import java.util.ArrayList;
import java.util.List;

@Component
public class ScoreListMapper {
    public List<ScoreDto> mapToDto(List<Score> scores) {
        List<ScoreDto> scoresDto = new ArrayList<>();

        for(Score score: scores) {
            ScoreDto scoreDto = new ScoreDto();

            scoreDto.setScoreId(score.getScoreId());
            scoreDto.setNick(score.getNick());
            scoreDto.setTime(score.getTime());
            scoreDto.setDifficultyLevel(score.getDifficultyLevel());

            scoresDto.add(scoreDto);
        }

        return scoresDto;
    }
}
