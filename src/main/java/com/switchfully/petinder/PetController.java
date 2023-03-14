package com.switchfully.petinder;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("pets")
public class PetController {

    private PetService service;

    public PetController(PetService service) {
        this.service = service;
    }

    @GetMapping("hello")
    public String helloPets() {
        return "Hello Pets!";
    }
    @GetMapping(produces = "application/json")
    public List<PetDTO> getAllPets() {
        return service.getAllPets();
    }
}
