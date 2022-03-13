package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Address;
import com.example.springboot_practice.dto.AddressResponseDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressRepository {
    List<AddressResponseDto> getAddressList();

    AddressResponseDto getAddress(Long userId);
}
