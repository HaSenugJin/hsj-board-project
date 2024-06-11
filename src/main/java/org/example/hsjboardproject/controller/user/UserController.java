package org.example.hsjboardproject.controller.user;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
    private final HttpSession session; // IOC 등록되어 있음 (스프링 실행 되면)

    @GetMapping("/join-form")
    public String joinForm() {
        return "user/join-form";
    }

    @GetMapping("/login-form")
    public String loginForm() {

        return "user/login-form";
    }

    @GetMapping("/user/update-form")
    public String updateForm() {
        return "user/update-form";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    @GetMapping("/oauth/kakao/callback")
    public String kakaoCallback(String code) {
        User sessionUser = userService.카카오로그인(code);
        session.setAttribute("sessionUser", sessionUser);
        return "redirect:/";
    }

    @GetMapping("/oauth/naver/callback")
    public String naverCallback(String code) {
        User sessionUser = userService.네이버로그인(code);
        session.setAttribute("sessionUser", sessionUser);
        return "redirect:/";
    }

    @PostMapping("login")
    public String login(UserRequest.LoginDTO reqDTO) {
        User user = userService.로그인(reqDTO);
        session.setAttribute("sessionUser", user);


        return "redirect:/";
    }
}
