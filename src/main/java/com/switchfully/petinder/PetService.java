package com.switchfully.petinder;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private PetMapper mapper;


    public PetService(PetMapper mapper) {
        this.mapper = mapper;
    }

    public List<PetDTO> getAllPets() {
        return mapper.toDTO(new PetRepository().getAllPets());
    }
}
