package saper.service;

import saper.dto.AddScoreDto;
import saper.dto.ScoreDto;

import java.util.List;

public interface SaperService {
    public List<ScoreDto> findAll();
    public List<ScoreDto> findAllByDifficultyLevel(String difficultyLevel);
    public void addScore(AddScoreDto addScoreDto);
}
