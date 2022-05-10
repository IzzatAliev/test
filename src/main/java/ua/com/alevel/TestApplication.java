package ua.com.alevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ua.com.alevel.entity.Computer;
import ua.com.alevel.entity.type.Corporation;
import ua.com.alevel.repository.ComputerRepository;

@SpringBootApplication
public class TestApplication {

    @Autowired
    ComputerRepository computerRepository;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void create() {
        for (int i = 1; i <= 10; i++) {
            Computer computer = new Computer();
            computer.setName("AIR-"+i);
            computer.setModel("x"+i);
            computer.setQuantity(100);
            computer.setPrice(450.0);
            if (i % 2 == 0){
                computer.setCorporation(Corporation.APPLE);
            }
            else {
                computer.setCorporation(Corporation.ASUS);
            }
            computerRepository.save(computer);
        }
    }
}
