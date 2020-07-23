package com.rbasistemas.specargresolver.domain.repository.spec;

import com.rbasistemas.specargresolver.domain.model.Club;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

@Or({
    @Spec(path = "clubId", params = "search", spec = Equal.class),
    @Spec(path = "name", params = "search", spec = Like.class),
    @Spec(path = "fundationDate", params = "search", spec = Equal.class),
    @Spec(path = "division", params = "search", spec = Equal.class),
})
public interface AllClubFieldsSpec extends Specification<Club> {}
