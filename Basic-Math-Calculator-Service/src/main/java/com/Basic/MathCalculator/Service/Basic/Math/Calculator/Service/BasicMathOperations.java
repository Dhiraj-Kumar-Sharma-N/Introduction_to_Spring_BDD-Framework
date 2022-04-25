package com.Basic.MathCalculator.Service.Basic.Math.Calculator.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicMathOperations {

    @GetMapping("/add/{n1}/{n2}")
    public @ResponseBody FormatResponseToJSON addition(@PathVariable int n1, @PathVariable int n2){
        return new FormatResponseToJSON(n1,n2,n1+n2);
    }


    @GetMapping("/subtract/{n1}/{n2}")
    public @ResponseBody FormatResponseToJSON subtraction(@PathVariable int n1, @PathVariable int n2){
        return new FormatResponseToJSON(n1,n2,n1-n2);
    }

    @GetMapping("/multiply/{n1}/{n2}")
    public @ResponseBody FormatResponseToJSON multiplication(@PathVariable int n1, @PathVariable int n2){
        return new FormatResponseToJSON(n1,n2,n1*n2);
    }

    @GetMapping("/divide/{n1}/{n2}")
    public @ResponseBody FormatResponseToJSON division(@PathVariable int n1, @PathVariable int n2){
        return new FormatResponseToJSON(n1,n2,n1/n2);
    }


}
