package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Board;
import com.example.springboot_practice.dto.BoardRequestDto;
import com.example.springboot_practice.dto.BoardResponseDto;
import com.example.springboot_practice.dto.BoardUpdateRequestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<BoardResponseDto> getList();

    List<Board> getUserBoardData(Long userId); //service에서 Boarddata를 가져오는 용도로 사용

    BoardResponseDto getBoardData(Long id);

    List<BoardResponseDto> getListByType(String boardType);

    List<BoardResponseDto> getBoardLimit();

    void saveBoardData(BoardRequestDto dto);

    void updateBoardData(BoardUpdateRequestDto dto);
}
