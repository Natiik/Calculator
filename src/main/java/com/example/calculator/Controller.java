package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping (value = "/{math}")
    public String Answer (@PathVariable String math){
        //String math="4+5";
        return Solution.solve(math);
    }

}

