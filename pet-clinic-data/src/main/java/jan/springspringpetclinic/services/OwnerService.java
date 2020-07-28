package jan.springspringpetclinic.services;

import jan.springspringpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLasName(String lastName);
}
