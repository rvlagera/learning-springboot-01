package dev.themobileapps.userservice.controller;

import dev.themobileapps.userservice.entity.User;
import dev.themobileapps.userservice.service.UserService;
import dev.themobileapps.userservice.vo.ResponseTemplateVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") int id) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(id);
    }
}
