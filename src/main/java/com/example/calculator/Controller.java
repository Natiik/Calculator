package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping ("/{math}")
    public String Answer (@PathVariable String math){
        return Solution.Solve(math);
        //return math;
    }

}

