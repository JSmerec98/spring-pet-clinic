package jan.springspringpetclinic.services;

import jan.springspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLasName(String lastName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
