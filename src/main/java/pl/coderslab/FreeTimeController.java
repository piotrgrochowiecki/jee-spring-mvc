package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class FreeTimeController {

//    @GetMapping("/free-time")
//    @ResponseBody
//    public String freeTime() {
//        LocalDate localDate = LocalDate.now();
//        LocalTime localTime = LocalTime.now();
//        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
//        if ((dayOfWeek == DayOfWeek.SATURDAY) || (dayOfWeek == DayOfWeek.SATURDAY)) {
//            return "Wolne";
//        } else if ((dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.TUESDAY || dayOfWeek == DayOfWeek.WEDNESDAY ||
//        dayOfWeek == DayOfWeek.THURSDAY || dayOfWeek == DayOfWeek.FRIDAY) && (localTime.isAfter(09:00) && localTime.isBefore(17:00:00)))
//    }
}
