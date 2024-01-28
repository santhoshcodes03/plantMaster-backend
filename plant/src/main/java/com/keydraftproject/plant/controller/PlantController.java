package com.keydraftproject.plant.controller;


import com.keydraftproject.plant.exception.UserNotFoundException;
import com.keydraftproject.plant.model.PlantModel;
import com.keydraftproject.plant.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class PlantController {

    @Autowired
    private PlantRepository plantRepository;

    @PostMapping("/addplant")
    PlantModel addPlant(@RequestBody PlantModel model){
        return plantRepository.save(model);
    }

    @GetMapping("/plants")
    List<PlantModel> allPlants(){
        return plantRepository.findAll();
    }

    @PutMapping("/updateplant/{id}")
    PlantModel updatePlant(@RequestBody PlantModel newInput, @PathVariable Long id){
        return plantRepository.findById(id).map(existing->{
            existing.setPlant_name(newInput.getPlant_name());
            existing.setAddress(newInput.getAddress());
            existing.setContact_no(newInput.getContact_no());
            return plantRepository.save(existing);
        }).orElseThrow(()-> new UserNotFoundException(id));
    }


}
