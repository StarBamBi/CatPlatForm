package com.example.catplatform.controller;

import com.example.catplatform.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/**")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/main")
    public String Hello(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "/board/main";
    }


}
