package com.example.homework4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.management.AttributeNotFoundException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.TimeZone;

@RestController
public class HelloUTCController {

    Times times = new Times("Pacific/Honolulu");

    //GET HTTP method
    //http://localhost:8080/hello-utc
    @GetMapping("/hello-utc")
    public String fetchUTC(){
        return Instant.now().toString();
    }

//    @PostMapping("/hello-utc")
//    public ZonedDateTime getUtcTime(@RequestBody Times tz) throws AttributeNotFoundException, Exception{
//
//    return times.getZonedDate();
//    }

    @PostMapping("/hello")
    public String postZoneTime(@RequestBody Times times){
        return times.getSomeTime();
    }
}
