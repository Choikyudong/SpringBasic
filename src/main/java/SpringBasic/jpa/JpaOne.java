package SpringBasic.jpa;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "jpaOne")
@Data
public class JpaOne {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
}
