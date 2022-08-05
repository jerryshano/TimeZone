package com.example.homework4;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Times {
    public String someTime;

    public Times() {
    }

    public Times(@JsonProperty("zone")String zone){
        this.someTime = LocalDateTime.now(
                TimeZone.getTimeZone(zone).toZoneId()).toString();
    }

    public ZonedDateTime getZonedDate() throws Exception {
        ZonedDateTime time;
        time = ZonedDateTime.now(ZoneId.of(someTime));
        return time;
    }

    public String getSomeTime() {
        System.out.println(someTime+" this is sometime");
        return someTime;
    }

    public void setUtcTime(String utcTime) {
        this.someTime = utcTime;
    }

}
