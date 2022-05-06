package ua.com.alevel.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.alevel.dto.request.UserRequest;
import ua.com.alevel.dto.response.UserResponse;
import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

@Component
public class UserFacadeImpl implements UserFacade<UserRequest, UserResponse> {

    private final UserService userService;

    @Autowired
    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void create(UserRequest userRequest) {
        User user = new User();
        user.setFirst_name(userRequest.getFirst_name());
        user.setLast_name(userRequest.getLast_name());
        user.setAge(userRequest.getAge());
        userService.create(user);
    }
}
