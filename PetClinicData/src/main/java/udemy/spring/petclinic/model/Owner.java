package udemy.spring.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString(callSuper = true)
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    @Builder
    public Owner(UUID id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }
}
