package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Board;
import com.example.springboot_practice.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<Board> getList() {
        return boardRepository.getList();
    }

    public Board getBoardData(Long boardId) {
        return boardRepository.getBoardData(boardId);
    }

    public List<Board> getListByType(String type) { return boardRepository.getListByType(type);}
}
