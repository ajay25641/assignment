package org.assignment.JPA_Mappings.Modal;


import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="student")
@Data
@ToString
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String firstName;

    private String lastName;


    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Address> addressList;



}
