package com.bits.OSSEAssignment4;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
   
   @GetMapping( value = "welcome", produces = APPLICATION_JSON_VALUE )
   public String welcome() {
      return "Welcome , Assignment 4. Curet time is : " + LocalDateTime.now();
         
   }

}
