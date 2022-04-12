package com.example.springboot_practice.service;

import com.example.springboot_practice.dto.BoardDeleteRequestDto;
import com.example.springboot_practice.dto.BoardRequestDto;
import com.example.springboot_practice.dto.BoardResponseDto;
import com.example.springboot_practice.dto.BoardUpdateRequestDto;
import com.example.springboot_practice.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public List<BoardResponseDto> getList() {
        return boardRepository.getList();
    }

    public BoardResponseDto getBoardData(Long boardId) {
        return boardRepository.getBoardData(boardId);
    }

    public List<BoardResponseDto> getListByType(String type) {
        return boardRepository.getListByType(type);
    }

    public int saveBoardData(BoardRequestDto dto) {
        try {
            boardRepository.saveBoardData(dto);
            return 200;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public int updateBoardData(BoardUpdateRequestDto dto) {
        try {
            boardRepository.updateBoardData(dto);
            return 300;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public int deleteBoardData(BoardDeleteRequestDto dto) {
        try {
            boardRepository.deleteBoardData(dto);
            return 400;
        } catch(Exception e){
            throw new RuntimeException();
        }

    }
}
