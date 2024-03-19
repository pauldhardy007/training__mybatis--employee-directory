package org.winharleigh.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.winharleigh.training.mapper.UsersMapper;
import org.winharleigh.training.model.Users;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResources {
    private final UsersMapper usersMapper;

    public UserResources(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersMapper.findAll();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable final String id) {
        return usersMapper.findById(id);
    }
}
