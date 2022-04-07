package com.example.springboot_practice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FoodRequestDto {
    private String food1;
    private String food2;
    private String food3;
    private String food4;
    private String food5;
    private String food6;
    private LocalDate date;
}
