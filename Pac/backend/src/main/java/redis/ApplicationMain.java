package redis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.SpringApplication;

@SpringBootApplication()
@EnableScheduling
public class ApplicationMain {


    public static void main(String[] args){
        SpringApplication.run(ApplicationMain.class, args);

    }

}
