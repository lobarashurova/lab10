package com.example.demo.category4;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greet")
    public String greet() {
        return greetingService.getGreeting();
    }
}