package com.example.springboot_practice.repository;

import com.example.springboot_practice.domain.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressRepository {
    List<Address> getAddressList();

    Address getAddress(Long userId);
}
