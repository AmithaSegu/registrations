package com.liftoff.registrations.models;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Register {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max = 50, message = "Enter name")
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    private int zipcode;

    @NotNull
    private String dob;

    @NotNull
    private int cardnumber;


//    @OneToMany
//    @JoinColumn(name="course_id")
//    private List<Course> course=new ArrayList<>();

    @ManyToOne
    private Course course;

//     @ManyToMany(mappedBy="registered")
//     private Course course;

    public Register(int id,Course course, String name, String address, String city,String state,int zipcode, String dob, int cardnumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.zipcode = zipcode;
        this.dob = dob;
        this.cardnumber = cardnumber;
        this.state=state;
        this.course=course;
    }

    public Register() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(){return state;}

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course=course;  }

//    @Override
//    public String toString() {
//        return "Register{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", city='" + city + '\'' +
//                ", state='" + state + '\'' +
//                ", zipcode=" + zipcode +
//                ", dob='" + dob + '\'' +
//                ", cardnumber=" + cardnumber +
//                ", course=" + course +
//                '}';
//    }
}