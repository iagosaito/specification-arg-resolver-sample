package com.rbasistemas.specargresolver.api.controller;

import com.rbasistemas.specargresolver.domain.model.Player;
import com.rbasistemas.specargresolver.domain.repository.PlayerRepository;
import com.rbasistemas.specargresolver.domain.repository.spec.PlayerSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping
    private List<Player> getAll(PlayerSpec.nameSpec spec) {
        return playerRepository.findAll(spec);
    }

}
