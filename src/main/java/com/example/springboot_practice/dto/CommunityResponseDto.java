package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CommunityResponseDto {
    private Long id;
    private String title;
    private Long publisher;
    private String contents;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate regDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;

}
