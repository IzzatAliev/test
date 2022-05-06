package ua.com.alevel.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRequest {

    private String first_name;
    private String last_name;
    private Integer age;
}
