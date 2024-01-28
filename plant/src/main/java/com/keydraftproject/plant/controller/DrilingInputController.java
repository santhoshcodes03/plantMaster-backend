package com.keydraftproject.plant.controller;


import com.keydraftproject.plant.exception.UserNotFoundException;
import com.keydraftproject.plant.model.DrillingInputModel;
import com.keydraftproject.plant.repository.DrillingInputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class DrilingInputController {

    @Autowired
    private DrillingInputRepository drillingInputRepository;
    @PostMapping("/addinput")
    DrillingInputModel addInput(@RequestBody DrillingInputModel drillingInput){
        return drillingInputRepository.save(drillingInput);
    }


    @GetMapping("/inputs")
    List<DrillingInputModel> allInputs() {
        return drillingInputRepository.findAll();
    }

    @PutMapping("/updateinput/{id}")
    DrillingInputModel updateInput(@RequestBody DrillingInputModel newInput, @PathVariable Long id){
        return drillingInputRepository.findById(id).map(existing->{
            existing.setDate(newInput.getDate());
            existing.setVendorName(newInput.getVendorName());
            existing.setPlantName(newInput.getPlantName());
            existing.setNoOfHoles(newInput.getNoOfHoles());
            existing.setFeetPerHole(newInput.getFeetPerHole());
            existing.setDrillingType(newInput.getDrillingType());
            existing.setType(newInput.getType());
            existing.setRate(newInput.getRate());
            existing.setTotalFeet(newInput.getTotalFeet());
            existing.setTotal(newInput.getTotal());
            existing.setAdvance(newInput.getAdvance());
            return drillingInputRepository.save(existing);
        }).orElseThrow(()-> new UserNotFoundException(id));
    }
}
