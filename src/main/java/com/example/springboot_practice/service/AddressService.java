package com.example.springboot_practice.service;

import com.example.springboot_practice.dto.AddressResponseDto;
import com.example.springboot_practice.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    public List<AddressResponseDto> getAddressList(){
        return addressRepository.getAddressList();
    }
    public AddressResponseDto getAddress(Long userId){
        return addressRepository.getAddress(userId);
    }
}
