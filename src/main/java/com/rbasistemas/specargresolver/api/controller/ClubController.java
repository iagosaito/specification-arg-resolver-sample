package com.rbasistemas.specargresolver.api.controller;

import com.rbasistemas.specargresolver.domain.model.Club;
import com.rbasistemas.specargresolver.domain.repository.ClubRepository;
import com.rbasistemas.specargresolver.domain.repository.spec.AllClubFieldsSpec;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/clubs")
public class ClubController {

    @Autowired
    private ClubRepository clubRepository;

    @GetMapping
    public List<Club> getAll(AllClubFieldsSpec spec) {
        return clubRepository.findAll(spec);
    }
}
