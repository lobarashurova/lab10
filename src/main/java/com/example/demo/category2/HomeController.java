package com.example.demo.category2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping( " / " )
    public String index () {
        return " index " ; // Maps to index . html
    }
    @PostMapping( " / submit " )
    public String handleSubmit ( @RequestParam String name ,
                                 Model model ) {
        model . addAttribute ( " greeting ", " Hello , " + name + " ! ");
        return " result " ;
    }
}