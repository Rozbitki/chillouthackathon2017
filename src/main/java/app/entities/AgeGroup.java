package app.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AGE_GROUP")
public class AgeGroup implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "AGE_GROUP")
    private String ageGroup;

    protected AgeGroup() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
}
