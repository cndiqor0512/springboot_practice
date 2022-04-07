package com.example.springboot_practice.dto;

import lombok.Data;


@Data
public class BoardRequestDto {
    private String title;
    private Long publisher;
    private String contents;
    private String boardType;
}
