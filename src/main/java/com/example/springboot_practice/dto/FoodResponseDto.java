package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FoodResponseDto {
    private Long id;
    private String food1;
    private String food2;
    private String food3;
    private String food4;
    private String food5;
    private String food6;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate regDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate date;
}
