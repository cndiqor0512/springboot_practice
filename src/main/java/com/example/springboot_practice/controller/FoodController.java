package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.FoodRequestDto;
import com.example.springboot_practice.dto.FoodResponseDto;
import com.example.springboot_practice.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping("/api/food")
    public List<FoodResponseDto> getFoodList() {
        return foodService.getFoodList();
    }

    @PostMapping("/api/food")
    public int saveFoodData(@RequestBody FoodRequestDto dto) {
        return foodService.saveFoodData(dto);
    }

    @GetMapping("/api/food/{foodId}")
    public FoodResponseDto getFoodData(@PathVariable Long foodId) {
        return foodService.getFoodData(foodId);
    }
}
