package saper.dto;

import java.io.Serializable;

public class ScoreDto implements Serializable {
    private Long scoreId;
    private String nick;
    private Integer time;
    private String difficultyLevel;

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public Integer getTime() {
        return time;
    }

    public String getNick() {
        return nick;
    }

    public Long getScoreId() {
        return scoreId;
    }
}
