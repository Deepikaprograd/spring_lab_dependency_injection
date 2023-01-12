package com.prograd.springdependencyinjection;

import DroneController.DroneController;
import DroneRepository.DroneRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDependencyInjectionApplication {
    public static void main(String[] args) {
        DroneRepository droneRepository = new DroneRepository();
        //DroneController droneController = new DroneController(droneRepository);
        //System.out.println(droneController.next());

        ApplicationContext applicationContext = SpringApplication.run(SpringDependencyInjectionApplication.class, args);
        for (String s:applicationContext.getBeanDefinitionNames()) {
            System.out.println(s);
        }
    }

    @Bean
    public Object returnBean(){
        return new Object();
    }

}
