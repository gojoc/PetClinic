package udemy.spring.petclinic.model;

import lombok.Builder;
import lombok.ToString;

import java.util.UUID;

@ToString(callSuper = true)
public class Vet extends Person {
    @Builder
    public Vet(UUID id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
}
