package ua.com.alevel.api.dto.request;

import lombok.Data;
import ua.com.alevel.entity.type.Corporation;

@Data
public class ComputerRequest {

    private String name;
    private String model;
    private Corporation corporation;
    private Double price;
    private Integer quantity;
}
