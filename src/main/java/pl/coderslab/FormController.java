package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class FormController {

    @RequestMapping("/form")
    public String hello() {
        return "form.jsp";
    }

    @PostMapping(value = "/formRequestParam", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String showName(@RequestParam String paramName, @RequestParam String paramDate) {
        return "Hello " + paramName + " on " + LocalDate.parse(paramDate);
    }
}
