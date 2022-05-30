package com.keerthijan.fasttag.controller;

import com.keerthijan.fasttag.dto.UserDetailsDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/userdetails")
    public String getalluserdetails() {
        return "success";
    }

    @GetMapping("/userdetails/{id}")
    public String getuserdetail(@PathVariable String id) {
        return "success";
    }

    @PostMapping("/userdetails")
    public String getnewuserdetails(@RequestBody UserDetailsDTO userDetailsDTO) {
        return "new user details added successfully";
    }

    @DeleteMapping("/userdetails/{id}")
    public String deleteuserdetails(@PathVariable String id) {
        return "user details deleted";
    }
}
