package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping(value = "/show-random", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showRandom() {
        double random = Math.random() * 10;
        String prompt = "Wylowosano liczbę " + random;
        return prompt;
    }
}
