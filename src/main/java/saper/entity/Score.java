package saper.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "scores")
public class Score implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scoreid")
    private Long scoreId;

    @Column(name = "nick")
    private String nick;

    @Column(name = "time")
    private Integer time;

    @Column(name = "difficultylevel")
    private String difficultyLevel;


    public Score() {

    }

    public Score(Long scoreId, String nick, Integer time, String difficultyLevel) {
        this.scoreId = scoreId;
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

    public Long getScoreId() {
        return scoreId;
    }

}
