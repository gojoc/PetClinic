package udemy.spring.petclinic.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString(callSuper = true)
public class Speciality extends BaseEntity {
    private String description;
}
