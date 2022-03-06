package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Board;
import com.example.springboot_practice.dto.UserBoardDataResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    List<Board> getList();

    List<Board> getUserBoardData(Long userId); //service에서 Boarddata를 가져오는 용도로 사용

    Board getBoardData(Long id);
}
