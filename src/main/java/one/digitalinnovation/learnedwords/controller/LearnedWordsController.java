package one.digitalinnovation.learnedwords.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/words")
public class LearnedWordsController {
    @GetMapping
    public String getWord(){
        return "API Test!";
    }
}
