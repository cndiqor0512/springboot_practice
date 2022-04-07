package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CalendarRequestDto {
    private String event;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
}
