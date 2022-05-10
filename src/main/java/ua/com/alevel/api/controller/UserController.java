package ua.com.alevel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.alevel.facade.UserFacade;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserFacade userFacade;

    @Autowired
    public UserController(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok().body("Hello ALLES");
    }

    @RequestMapping(value = "/bye", method = RequestMethod.GET)
    public ResponseEntity<String> nextHello(){
        return ResponseEntity.status(HttpStatus.OK).body("Bye ALLES");
    }
}
