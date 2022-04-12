package com.example.springboot_practice.service;

import com.example.springboot_practice.domain.Calendar;
import com.example.springboot_practice.domain.Food;
import com.example.springboot_practice.dto.FoodDeleteRequestDto;
import com.example.springboot_practice.dto.FoodRequestDto;
import com.example.springboot_practice.dto.FoodResponseDto;
import com.example.springboot_practice.dto.FoodUpdateRequestDto;
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

    public int saveFoodData(FoodRequestDto dto) {
        try{
            foodRepository.saveFoodData(dto);
            return 200;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }
    public int updateFoodData(FoodUpdateRequestDto dto){
        try{
            foodRepository.updateFoodData(dto);
            return 300;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }

    public int deleteFoodData(FoodDeleteRequestDto dto){
        try {
            foodRepository.deleteFoodData(dto);
            return 400;
        }
        catch(Exception e){
            throw new RuntimeException();
        }
    }
}
