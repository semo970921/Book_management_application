package com.group.libraryapp.controller.user;

import com.group.libraryapp.dto.user.request.UserCreateRequest;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import com.group.libraryapp.dto.user.response.UserResponse;
import com.group.libraryapp.service.user.UserServiceV2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    private final UserServiceV2 userServiceV2;

    public UserController(UserServiceV2 UserServiceV2) {

        this.userServiceV2 = UserServiceV2;

    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest request) {
        userServiceV2.saveUser(request);
    }

    @GetMapping("/user")
    public List<UserResponse> getUsers() {
        return userServiceV2.getUsers();
    }

    @PutMapping("/user")
    public void updateUser (@RequestBody UserUpdateRequest request) {
       userServiceV2.updateUser(request);
    }

    @DeleteMapping("/user")
    public void deleteUser (@RequestParam String name) {
       userServiceV2.deleteUser(name);
    }
}

