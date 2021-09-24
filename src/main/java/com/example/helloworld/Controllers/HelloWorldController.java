package com.example.helloworld.Controllers;
import com.example.helloworld.Services.DayOfTheWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloWorldController {

    @GetMapping("/Hello-World")
    public String firstMapping(){
        return "Hello World";
    }

    @GetMapping("/")
    public String SecondMapping(@RequestParam String input){
        return input;
    }

    @GetMapping("/ErDetFredag")
    public String erDetFredag(){

        Date d = new Date();
        if (d.getDay() == 5) {
            return "Ja!";
        } else {
            return "Nej!";
        }
    }

    @GetMapping("/EDF")
    public String Edf(@RequestParam String thisDate){

        String[] date = thisDate.split("-");
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        DayOfTheWeek dotw = new DayOfTheWeek();
        int today = dotw.dayOfTheWeek(day,month,year);

        if(today == 5){
            return "Yes!";
        } else
            return "No!";
    }

}
