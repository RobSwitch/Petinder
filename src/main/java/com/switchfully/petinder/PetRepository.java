package com.switchfully.petinder;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetRepository {

    private final List<Pet> petList = List.of(new Pet(0), new Pet(1), new Pet(2));
    public List<Pet> getAllPets() {
        return this.petList;
    }
}
