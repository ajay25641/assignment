package demoAssignment.Modal;



import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="employee")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int employeeId;

    private String email;

    @Column(name="name")
    private String name;

    @NotBlank(message = "mobile nuumber should  not be blank")
    @Pattern(regexp = "[6789][0-9]{9}",message = "mobile no. should be of 10 digits")
    private String mobileNum;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public User(){

    }
    public User(int employeeId, String email, String name, String mobileNum) {
        this.employeeId = employeeId;
        this.email = email;
        this.name = name;
        this.mobileNum = mobileNum;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
