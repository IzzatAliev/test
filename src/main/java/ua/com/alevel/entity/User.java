package ua.com.alevel.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document("users")
public class User {

    @Id
    private Long id;
    private String first_name;
    private String last_name;
    private Integer age;
}

































//package ua.com.alevel.entity;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "users")
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    @Column(name = "first_name")
//    private String first_name;
//    @Column(name = "last_name")
//    private String last_name;
//    @Column(name = "age")
//    private Integer age;
//
//    public User(String first_name, String last_name, Integer age) {
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.age = age;
//    }
//}
