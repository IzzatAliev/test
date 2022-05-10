package ua.com.alevel.api.dto.request;

import lombok.*;

@Data
public class UserRequest {

    private String first_name;
    private String last_name;
    private Integer age;
}
