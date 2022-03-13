package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
@Data
public class BoardResponseDto {
    private Long id;
    private String title;
    private Long publisher;
    private String contents;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate regDate;
    private String board_type;
}
