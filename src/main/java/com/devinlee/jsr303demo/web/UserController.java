package com.devinlee.jsr303demo.web;

import com.devinlee.jsr303demo.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @PostMapping("/user")
    public String user(@Valid @RequestBody User user, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return "SUCCESS";
    }
}
