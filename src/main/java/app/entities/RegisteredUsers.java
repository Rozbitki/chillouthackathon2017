package app.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REGISTERED_USERS")
public class RegisteredUsers implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    protected RegisteredUsers() {

    }

}
