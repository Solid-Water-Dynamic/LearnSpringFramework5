package net.azurewebsites.solidwater.springpetclinic.services;

import net.azurewebsites.solidwater.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
