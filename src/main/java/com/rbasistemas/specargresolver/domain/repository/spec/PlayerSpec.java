package com.rbasistemas.specargresolver.domain.repository.spec;

import com.rbasistemas.specargresolver.domain.model.Club;
import com.rbasistemas.specargresolver.domain.model.Player;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;

public interface PlayerSpec {

    @Spec(path = "firstName", params = "name", spec = Like.class)
    interface firstNameSpec extends Specification<Player>{}

    @Spec(path = "lastName", params = "name", spec = Like.class)
    interface lastNameSpec extends Specification<Player>{}

    @Or({
        @Spec(path = "firstName", params = "name", spec = Like.class),
        @Spec(path = "lastName", params = "name", spec = Like.class)
    })
    interface nameSpec extends Specification<Player>{}
}
