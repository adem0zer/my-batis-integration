package com.adem.impl;

import com.adem.model.City;
import com.adem.repository.CityRepository;
import com.adem.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.getAll();
    }
}
