package udemy.spring.petclinic.model;

import lombok.Builder;
import lombok.ToString;

import java.util.UUID;

@ToString(callSuper = true)
public class Owner extends Person {
    @Builder
    public Owner(UUID id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
}
