package com.judas.hello;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ComplimentController {

    private Compliment[] compliments = { //Creates an array

            new Compliment("You look nice today"),
            new Compliment("Your code looks really nice!"), //the comma allows this to be one long line of code
            new Compliment("I hope you have a great day")

    }; //semi colon goes at the end of the array block

    private Random rnd = new Random();

    @RequestMapping("/random")
    ResponseEntity<Compliment> randomCompliment(){
        Compliment randomCompliment = compliments[rnd.nextInt(compliments.length)];
        return new ResponseEntity<>(randomCompliment, HttpStatus.OK);
    }
}
