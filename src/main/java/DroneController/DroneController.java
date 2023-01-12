package DroneController;

import DroneRepository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroneController {

    @Autowired
    private DroneRepository droneRepository;

//    public DroneController(DroneRepository droneRepository) {
//        this.droneRepository = droneRepository;
//    }


//    public void setDroneRepository(DroneRepository droneRepository) {
//        this.droneRepository = droneRepository;
//    }

    public String next(){
        return "Next Drone";
    }
}
