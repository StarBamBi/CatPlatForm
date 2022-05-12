package com.example.catplatform.service;

import com.example.catplatform.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public List<Map<String, Object>> boardList() {
        return boardMapper.boardList();
    }
}
