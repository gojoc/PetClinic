package udemy.spring.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString(callSuper = true)
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;

    @ToString.Exclude
    private Set<Pet> pets = new HashSet<>();

    @Builder
    public Owner(UUID id, String firstName, String lastName, String address, String city, String telephone) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setCity(city);
        setTelephone(telephone);
    }
}
