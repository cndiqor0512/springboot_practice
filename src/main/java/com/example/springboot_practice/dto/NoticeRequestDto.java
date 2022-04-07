package com.example.springboot_practice.dto;

import lombok.Data;

@Data
public class NoticeRequestDto {
    private String title;
    private Long publisher;
    private String contents;
}
