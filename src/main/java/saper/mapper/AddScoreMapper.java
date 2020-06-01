package saper.mapper;

import org.springframework.stereotype.Component;
import saper.dto.AddScoreDto;
import saper.entity.Score;

@Component
public class AddScoreMapper {
    public Score mapToEntity(AddScoreDto addScoreDto) {
        Score score = new Score();

        score.setNick(addScoreDto.getNick());
        score.setTime(addScoreDto.getTime());
        score.setDifficultyLevel(addScoreDto.getDifficultyLevel());

        return score;
    }
}
