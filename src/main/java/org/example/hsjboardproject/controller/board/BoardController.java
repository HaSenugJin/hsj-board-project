package org.example.hsjboardproject.controller.board;

import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.example.hsjboardproject.controller.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class BoardController {
    private final HttpSession session;

    @GetMapping("/" )
    public String index() {

        return "index";
    }

    @GetMapping("/board/save-form")
    public String saveForm() {
        return "board/save-form";
    }

    @PostMapping("/board/save")
    public String save(String content, String title) {
        System.out.println(content);
        System.out.println(title);

        return "redirect:/";
    }

    @GetMapping("/board/{id}")
    public String detail(@PathVariable Integer id) {

        return "board/detail";
    }
}