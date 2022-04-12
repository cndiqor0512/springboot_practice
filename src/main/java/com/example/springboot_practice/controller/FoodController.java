package com.example.springboot_practice.controller;

import com.example.springboot_practice.dto.FoodDeleteRequestDto;
import com.example.springboot_practice.dto.FoodRequestDto;
import com.example.springboot_practice.dto.FoodResponseDto;
import com.example.springboot_practice.dto.FoodUpdateRequestDto;
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

    @PutMapping("/api/food")
    public int updateFoodData(@RequestBody FoodUpdateRequestDto dto){ return foodService.updateFoodData(dto);}

    @DeleteMapping("/api/food")
    public int deleteFoodData(@RequestBody FoodDeleteRequestDto dto){return foodService.deleteFoodData(dto);}
}
