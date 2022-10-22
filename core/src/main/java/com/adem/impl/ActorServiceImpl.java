package com.adem.impl;

import com.adem.model.Actor;
import com.adem.repository.ActorRepository;
import com.adem.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {
    private final ActorRepository actorRepository;

    @Override
    public List<Actor> getAll() {
        return actorRepository.getAll();
    }
}
