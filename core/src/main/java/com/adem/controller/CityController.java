package com.adem.controller;

import com.adem.model.City;
import com.adem.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {
    private final CityService service;

    @GetMapping("getAll")
    private Flux<List<City>> getAll() {
        return Flux.just(service.getAll());
    }
}
