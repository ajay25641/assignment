package org.assignment.JPA_Mappings.Modal;


import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="address")
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String city;
    private String state;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="studentId")
    private Student student;


    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", state='" + state  +

                '}';
    }
}
