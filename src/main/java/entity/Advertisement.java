package entity;

import javax.persistence.*;

@Entity
@Table(name = "ADVERTISEMENT")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;
}
