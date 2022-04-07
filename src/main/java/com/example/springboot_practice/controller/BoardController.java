package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.BoardRequestDto;
import com.example.springboot_practice.dto.BoardResponseDto;
import com.example.springboot_practice.dto.BoardUpdateRequestDto;
import com.example.springboot_practice.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/api/board/id/{boardId}")
    public BoardResponseDto getBoardData(@PathVariable Long boardId) {
        return boardService.getBoardData(boardId);
    }

    @GetMapping("/api/board")
    public List<BoardResponseDto> getList() {
        return boardService.getList();
    }

    @PostMapping("/api/board")
    public int saveBoardData(@RequestBody BoardRequestDto dto) {
        return boardService.saveBoardData(dto);
    }

    @GetMapping("/api/board/type/{type}")
    public List<BoardResponseDto> getBoardListByType(@PathVariable String type) {
        return boardService.getListByType(type);
    }

    @PutMapping("/api/board")
    public int updateBoardData(@RequestBody BoardUpdateRequestDto dto) {
        return boardService.updateBoardData(dto);
    }


}
