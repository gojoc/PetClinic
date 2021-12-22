package udemy.spring.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString(callSuper = true)
public class Pet extends BaseEntity {
    private String name;
    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

    @Builder
    public Pet(UUID id, String name, LocalDate birthDate, PetType petType, Owner owner) {
        setId(id);
        setName(name);
        setBirthDate(birthDate);
        setPetType(petType);
        setOwner(owner);
    }
}
