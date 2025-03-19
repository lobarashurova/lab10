package com.example.demo.category5;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService ;
    @GetMapping ("/add ")
    public int add ( @RequestParam int a , @RequestParam int b )
    {
        return calculatorService.add (a , b ) ;
    }
    @GetMapping ("/multiply ")
    public int multiply ( @RequestParam int a , @RequestParam int b )
    {
        return calculatorService.multiply (a , b ) ;
    }
    @GetMapping ("/division ")
    public int division ( @RequestParam int a , @RequestParam int b )
    {
        return calculatorService.division (a , b ) ;
    }
    @GetMapping ("/subtraction ")
    public int subtraction ( @RequestParam int a , @RequestParam int b )
    {
        return calculatorService.subtraction (a , b ) ;
    }
}
