package ua.com.alevel.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserResponse {

    private String first_name;
    private String last_name;
    private Integer age;
}
