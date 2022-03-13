package com.example.springboot_practice.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Calendar {
    private Long id;
    private String event;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate regDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
}
