package entity;

import enums.Discipline;
import enums.ExpGroup;
import enums.Frequency;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "ADVERTISEMENT")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNER")
    private User owner;

    @Column(name = "CAPASITY")
    private Long capasity;

    @Column(name = "AGE_GROUP")
    private AgeGroup agrGroup;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "END_TIME")
    private LocalDateTime endTime;

    @Column(name = "DISCIPLINE")
    private Discipline discipline;

    @Type(type = "yes_no")
    @Column(name = "DELETED")
    private Boolean deleted;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "FREQUENCY")
    private Frequency frequency;

    @ManyToOne
    @Column(name = "REGISTERED_USERS")
    private List<User> registeredUsers;


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

    public Long getCapasity() {
        return capasity;
    }

    public void setCapasity(Long capasity) {
        this.capasity = capasity;
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

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
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

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(List<User> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public ExpGroup getExpGroup() {
        return expGroup;
    }

    public void setExpGroup(ExpGroup expGroup) {
        this.expGroup = expGroup;
    }
}
