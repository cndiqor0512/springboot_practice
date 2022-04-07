package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class CalendarResponseDto {
    private Long id;
    private String event;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate regDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDate;
}
