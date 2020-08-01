package jan.springspringpetclinic.services;

import jan.springspringpetclinic.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLasName(String lastName);
}
