package fr.gwombat.predicadmin.support.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * Base class of all JPA entities
 */
@MappedSuperclass
@Data
@EqualsAndHashCode(of = "identifier")
class BasicEntity implements Serializable {

    private static final long serialVersionUID = -1206235273085569865L;

    /**
     * Unique string based identifier of this entity. This id can be used for public use if needed.
     * Thus, for security reasons, it must be different from the database primary key value.
     */
    @NotBlank
    @Column(name = "identifier", unique = true, nullable = false, length = 32)
    private String identifier = EntityIdGenerator.generateId();

}
