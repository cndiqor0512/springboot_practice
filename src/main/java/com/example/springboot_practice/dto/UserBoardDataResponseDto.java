package com.example.springboot_practice.dto;
import com.example.springboot_practice.domain.Board;
import lombok.Data;

import java.util.List;


@Data
public class UserBoardDataResponseDto {
    //Controller로 보낼 양식:
    private Long userId;
    private String name;
    private int age;
    private Long address;
    private List<Board> boardData;
}
