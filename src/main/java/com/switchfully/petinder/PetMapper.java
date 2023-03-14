package com.switchfully.petinder;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class PetMapper {

    private PetDTO petDTO;

    public List<PetDTO> toDTO(List<Pet> petList) {
        return petList.stream().map(this::petToDTO).collect(Collectors.toList());
    }

    public PetDTO petToDTO(Pet pet) {
        return new PetDTO(pet.getId(), pet.getName(), pet.getKind(), pet.getProfileText());
    }
}
