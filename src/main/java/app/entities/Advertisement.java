package app.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ADVERTISEMENT", schema = "public")
public class Advertisement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    protected Advertisement() {

    }

    public Advertisement(Long id, String description) {
        this.id = id;
        this.description = description;
    }
}
