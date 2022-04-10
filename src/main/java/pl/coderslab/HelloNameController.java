package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloNameController {

    @GetMapping(value = "/hello/{firstName}/{lastName}", produces = "text/plain; charset=UTF-8")
    @ResponseBody
    public String helloName(@PathVariable String firstName, @PathVariable String lastName){
        return "Hello " + firstName + " " + lastName + "!";
    }
}
