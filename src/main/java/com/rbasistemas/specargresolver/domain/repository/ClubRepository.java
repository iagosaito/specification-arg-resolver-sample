package com.rbasistemas.specargresolver.domain.repository;

import com.rbasistemas.specargresolver.domain.model.Club;
import com.rbasistemas.specargresolver.domain.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long>, JpaSpecificationExecutor<Club> {
}
