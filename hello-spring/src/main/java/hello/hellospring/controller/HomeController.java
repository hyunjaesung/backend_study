package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    // 스프링 컨트롤러에 등록된게 우선순위를 가지며 /static/index.html 은 무시된다
    public String home(){
        return "home";
    }
}
