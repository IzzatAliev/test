package ua.com.alevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ua.com.alevel.entity.User;
import ua.com.alevel.repository.UserRepository;

@SpringBootApplication
//@EnableJpaRepositories
@EnableMongoRepositories
public class TestApplication {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void createUsers(){
        for (long i = 0; i < 15; i++) {
            User user = new User(i,"kiril"+i, "tokov"+i, 20);
            userRepository.save(user);
        }
    }

}
