package ua.com.alevel.api.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import ua.com.alevel.entity.Computer;
import ua.com.alevel.entity.type.Corporation;

@Getter
@Setter
public class ComputerResponse extends ResponseDto {

    private String name;
    private String model;
    private Corporation corporation;
    private Double price;
    private Integer quantity;

    public ComputerResponse() { }

    public ComputerResponse(Computer computer) {
        BeanUtils.copyProperties(computer, this);
//        BeanUtils.copyProperties(computer, super,);
    }
}
