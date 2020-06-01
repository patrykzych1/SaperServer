package saper.dto;

import java.io.Serializable;

public class AddScoreDto implements Serializable {
    private String nick;
    private Integer time;
    private String difficultyLevel;

    public AddScoreDto(String nick, Integer time, String difficultyLevel) {
        this.nick = nick;
        this.time = time;
        this.difficultyLevel = difficultyLevel;
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
}
