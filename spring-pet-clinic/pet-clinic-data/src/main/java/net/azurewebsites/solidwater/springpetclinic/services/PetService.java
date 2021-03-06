package net.azurewebsites.solidwater.springpetclinic.services;

import net.azurewebsites.solidwater.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
