package ua.com.alevel.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.alevel.facade.UserFacade;
import ua.com.alevel.service.UserService;

@Component
public class UserFacadeImpl implements UserFacade {

    private final UserService userService;

    @Autowired
    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }
}
