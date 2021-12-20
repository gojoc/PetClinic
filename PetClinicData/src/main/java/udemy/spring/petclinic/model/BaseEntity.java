package udemy.spring.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@ToString
public class BaseEntity implements Serializable {
    private UUID id;
}
