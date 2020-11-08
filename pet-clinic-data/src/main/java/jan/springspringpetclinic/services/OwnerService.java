package jan.springspringpetclinic.services;

import jan.springspringpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLasName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
