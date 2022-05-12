package com.example.catplatform.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BoardMapper {
    List<Map<String, Object>> boardList();
}
