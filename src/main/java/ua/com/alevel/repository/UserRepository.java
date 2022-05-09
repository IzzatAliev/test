package ua.com.alevel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.alevel.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}






//package ua.com.alevel.repository;
//
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
//import ua.com.alevel.entity.User;
//
//@Repository
//public interface UserRepository extends MongoRepository<User, Long> {
//
//}
