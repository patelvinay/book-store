package com.example.bookstore;


import com.example.bookstore.model.Inquiry;
import com.example.bookstore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/author")
    public String author(Model model){
        model.addAttribute("authors", homeService.getAuthors());
        return "author";
    }

    @PostMapping("/author")
    public String searchAuthor(Model model, @ModelAttribute Inquiry inquiry){
        String authorName = inquiry.getSearchString();
        model.addAttribute("authors", homeService.searchedAuthors(authorName));
        return "author";
    }
    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/blog-single")
    public String blogSingle(){
        return "blog-single";
    }

    @GetMapping("/book")
    public String book(){
        return "book";
    }

    @GetMapping("/coming-soon")
    public String comingSoon(){
        return "coming-soon";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/top-seller")
    public String topSeller(){
        return "top-seller";
    }

}
