package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";     // URL로 리다이렉트 (완전히 새로운 URL로 요청)
                                              // forward: - URL로 포워드 (기존 요청 값들이 유지된 상태로 URL이 전환)
    }
}
