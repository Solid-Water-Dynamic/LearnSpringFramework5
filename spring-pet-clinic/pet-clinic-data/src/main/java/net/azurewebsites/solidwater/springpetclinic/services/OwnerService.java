package net.azurewebsites.solidwater.springpetclinic.services;

import net.azurewebsites.solidwater.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
