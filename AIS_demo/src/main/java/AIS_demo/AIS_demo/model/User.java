package AIS_demo.AIS_demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name = "username", nullable = false)
	String username;
	
	@Column(name = "password")
	String password;
	
	@Column(name = "fullname")
	String fullname;
	
	@Column(name = "address")
	String address;
	
	@Column(name = "phone")
	String phone;
	
	@Column(name = "email")
	String email;
	
	//@Column(name = "created_by")
	//String created_by;
	
	//@CreationTimestamp
	//LocalDateTime created_at;
}

