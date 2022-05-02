package com.github.kbuntrock.sample.rest;

import fr.github.kbuntrock.sample.dto.Authority;
import fr.github.kbuntrock.sample.dto.UserDto;
import fr.github.kbuntrock.sample.enpoint.UserController;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;
import java.util.Set;

@RestController
public class UserControllerImpl implements UserController {

    @Override
    public List<String> getAllUsernames() {
        return List.of("tata", "yoyo");
    }

    @Override
    public int getNbUsers() {
        return 24;
    }

    @Override
    public List<Integer> getNumberList() {
        return List.of(4, 899, 7, 100, 0, 5);
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        userDto.setAuthorities(Set.of(Authority.ACCESS_APP, Authority.READ_USER));
        userDto.setCreatedDate(Instant.now());
        userDto.setCreatedBy("Kévin");
        userDto.setId(1000L);
        userDto.setImageUrl("http://monimage.klee.fr");

        return userDto;
    }
}
