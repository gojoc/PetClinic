package udemy.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
