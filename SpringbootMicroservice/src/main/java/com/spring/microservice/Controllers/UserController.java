package com.spring.microservice.Controllers;

import com.spring.microservice.models.Speaker;
import com.spring.microservice.models.User;
import com.spring.microservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> create() {
        return userRepository.findAll();
    }

    @PostMapping
    public User create(@RequestBody final User userObj) {
        System.out.println("Print user object");
        System.out.println(userObj);
        return  userRepository.saveAndFlush(userObj);
    }
}
