package edu.icet.MyProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser(){
        return "Simple-Root";
    }
    @PostMapping("/saveUser")
    public String saveUser(){
        return "User Saved !";
    }
    @PutMapping("/updateUser")
    public String updateUser(){
        return "User Updated !";
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User Deleted !";
    }
}
