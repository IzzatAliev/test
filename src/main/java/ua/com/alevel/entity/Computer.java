package ua.com.alevel.entity;

import lombok.*;
import ua.com.alevel.entity.type.Corporation;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "computers")
public class Computer extends BaseEntity {

    @Column(name = "computer_name")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "corporation")
    @Enumerated(EnumType.STRING)
    private Corporation corporation;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;
}
