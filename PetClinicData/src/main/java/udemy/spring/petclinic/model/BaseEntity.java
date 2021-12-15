package udemy.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class BaseEntity implements Serializable {
    private UUID id;
}
