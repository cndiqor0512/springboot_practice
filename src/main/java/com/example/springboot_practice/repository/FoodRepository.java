package com.example.springboot_practice.repository;

import com.example.springboot_practice.dto.FoodRequestDto;
import com.example.springboot_practice.dto.FoodResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodRepository {
    List<FoodResponseDto> getFoodList();

    FoodResponseDto getFoodData(Long id);

    List<FoodResponseDto> getFoodLimit();

    void saveFoodData(FoodRequestDto dto);
}
