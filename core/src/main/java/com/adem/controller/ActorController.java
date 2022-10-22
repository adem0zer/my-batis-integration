package com.adem.controller;

import com.adem.model.Actor;
import com.adem.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/actor")
@RequiredArgsConstructor
public class ActorController {
    private final ActorService actorService;

    @GetMapping(value = "/getAll")
    Flux<List<Actor>> getAll() {
        return Flux.just(actorService.getAll());
    }
}
