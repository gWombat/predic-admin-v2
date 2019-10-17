package fr.gwombat.predicadmin.support.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

/**
 * Represents an entity which is "audited": we store information about creator, created date and last modified date and user.
 */
@Getter
@Setter
@ToString
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditableEntity extends BasicEntity {

    private static final long serialVersionUID = -3782800090673191691L;

    @CreatedBy
    @Column(name = "created_by")
    protected String createdBy;

    @LastModifiedBy
    @Column(name = "last_modified_by")
    protected String lastModifiedBy;

    @CreatedDate
    @Column(name = "created_date")
    protected LocalDate createdDate;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    protected LocalDate lastModifiedDate;

}
