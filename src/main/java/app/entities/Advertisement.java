package app.entities;

import app.enums.ExpGroup;
import app.enums.Frequency;
import app.enums.SportDiscipline;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ADVERTISEMENT")
public class Advertisement implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNER")
    private User owner;

    @Column(name = "CAPACITY")
    private Long capacity;

    @Column(name = "AGE_GROUP")
    private AgeGroup agrGroup;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "END_TIME")
    private LocalDateTime endTime;

    @Column(name = "DISCIPLINE")
    private SportDiscipline sportDiscipline;

    @Type(type = "yes_no")
    @Column(name = "DELETED")
    private Boolean deleted;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "FREQUENCY")
    private Frequency frequency;

    @ManyToOne
    @JoinColumn(name = "REGISTERED_USERS")
    private RegisteredUsers registeredUsers;


    @Column(name = "EXP_GROUP")
    private ExpGroup expGroup;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public AgeGroup getAgrGroup() {
        return agrGroup;
    }

    public void setAgrGroup(AgeGroup agrGroup) {
        this.agrGroup = agrGroup;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public SportDiscipline getSportDiscipline() {
        return sportDiscipline;
    }

    public void setSportDiscipline(SportDiscipline sportDiscipline) {
        this.sportDiscipline = sportDiscipline;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public RegisteredUsers getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(RegisteredUsers registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public ExpGroup getExpGroup() {
        return expGroup;
    }

    public void setExpGroup(ExpGroup expGroup) {
        this.expGroup = expGroup;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }
}
