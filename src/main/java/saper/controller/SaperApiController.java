package saper.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import saper.dto.AddScoreDto;
import saper.dto.ScoreDto;
import saper.service.SaperService;
import java.util.List;

@Controller
@RequestMapping(value="/api")
public class SaperApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SaperApiController.class);

    private SaperService saperService;

    @Autowired
    public SaperApiController(SaperService saperService) {
        this.saperService = saperService;
    }

    @CrossOrigin
    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ScoreDto>> getScores() {
        List<ScoreDto> scoresDto = saperService.findAll();

        return new ResponseEntity<>(scoresDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addScore(@RequestBody AddScoreDto addScoreDto) {

        saperService.addScore(addScoreDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
