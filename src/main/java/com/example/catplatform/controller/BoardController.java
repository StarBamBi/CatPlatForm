package com.example.catplatform.controller;

import com.example.catplatform.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String Hello(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "board/main";
    }


}
