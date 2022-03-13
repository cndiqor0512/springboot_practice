package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Calendar;
import com.example.springboot_practice.domain.Food;
import com.example.springboot_practice.dto.FoodResponseDto;
import com.example.springboot_practice.repository.CalendarRepository;
import com.example.springboot_practice.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    public List<FoodResponseDto> getFoodList(){
        return foodRepository.getFoodList();
    }

    public FoodResponseDto getFoodData(Long id){
        return foodRepository.getFoodData(id);
    }
}
