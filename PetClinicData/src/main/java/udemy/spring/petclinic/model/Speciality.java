package udemy.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Speciality extends BaseEntity {
    private String description;
}
