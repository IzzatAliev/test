package ua.com.alevel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.alevel.dto.request.UserRequest;
import ua.com.alevel.facade.UserFacade;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @PostMapping()
    public ResponseEntity<Boolean> create(@RequestBody UserRequest userRequest){
        userFacade.create(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(true);
    }

    @GetMapping("")
    public String hello(){
        return "Hello";
    }

    @RequestMapping(value = "/oop", method = RequestMethod.GET)
    public String nextHello(){
        return "Hello Nachste";
    }
}
