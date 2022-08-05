package com.example.homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Homework4ApplicationTests {

    Times empty = new Times();
    Times param = new Times("Pacific/Honolulu");

    @Test
    void contextLoads() {
    }

    @Test
    void testGetZonedDate(){
        try {
            assert (empty.getZonedDate().toString().contains("2022"));
            Assertions.assertNotNull(empty.getZonedDate());
        } catch (Exception e){
            System.out.println(e.toString() + " new e");
        }
    }

    @Test
    void testGetSomeTime(){
        assert (param.getSomeTime().contains("2022"));
    }

}
