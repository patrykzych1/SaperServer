package saper.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import saper.dto.AddScoreDto;
import saper.dto.ScoreDto;
import saper.entity.Score;
import saper.mapper.AddScoreMapper;
import saper.mapper.ScoreListMapper;
import saper.repository.SaperRepository;
import saper.service.SaperService;

import java.util.List;

@Service
public class SaperServiceImpl implements SaperService {

    private final SaperRepository saperRepository;
    private final AddScoreMapper addScoreMapper;
    private final ScoreListMapper scoreListMapper;

    @Autowired
    public SaperServiceImpl(SaperRepository saperRepository,
                            AddScoreMapper addScoreMapper,
                            ScoreListMapper scoreListMapper) {
        this.saperRepository = saperRepository;
        this.addScoreMapper = addScoreMapper;
        this.scoreListMapper = scoreListMapper;
    }

    @Override
    public List<ScoreDto> findAll() {
        List<Score> scores = saperRepository.findAll(sortByTimeAsc());
        return scoreListMapper.mapToDto(scores);
    }

    @Override
    public List<ScoreDto> findAllByDifficultyLevel(String difficultyLevel) {
        List<Score> scores = saperRepository.findAllByDifficultyLevel(difficultyLevel);
        return scoreListMapper.mapToDto(scores);
}

    @Override
    public void addScore(AddScoreDto addScoreDto) {
        saperRepository.save(addScoreMapper.mapToEntity(addScoreDto));
    }

    private Sort sortByTimeAsc() {
        return new Sort(Sort.Direction.ASC, "time");
    }


}
