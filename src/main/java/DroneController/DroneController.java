package DroneController;

import DroneRepository.DroneRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroneController {

    private final DroneRepository droneRepository;

    public DroneController(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }

    public String next(){
        return "Next Drone";
    }
}
