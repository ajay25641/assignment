package assignment3.Modal;

//import javax.annotation.Generated;


import jakarta.persistence.*;



@Entity
@Table(name="employee")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String email;
	
	@Column(name="name")
	private String userName;
	private String password;
	private String mobileNum;
	
	public String getMobileNum() {
		return mobileNum;
	}
	public User(int userId, String email, String userName, String password, String mobileNum) {
		super();
		this.userId = userId;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.mobileNum = mobileNum;
	}
	public User() {
		
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", userName=" + userName + ", password=" + password + "]";
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
