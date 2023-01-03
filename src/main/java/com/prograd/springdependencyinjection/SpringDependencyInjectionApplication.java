package com.prograd.springdependencyinjection;

import DroneController.DroneController;
import DroneRepository.DroneRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDependencyInjectionApplication {
    public static void main(String[] args) {
        DroneRepository droneRepository = new DroneRepository();
        DroneController droneController = new DroneController(droneRepository);
        System.out.println(droneController.next());

        SpringApplication.run(SpringDependencyInjectionApplication.class, args);
    }

}
