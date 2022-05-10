package ua.com.alevel.api.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ResponseDto {

    Long id;
    Date created;
    Date updated;
}
