package com.app.pojos;


import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="vendors")
public class Vendor 
{
	private Integer id;
	private String name, email, password, role, city, phn;
	private double regAmount;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regDate;

	public Vendor() 
	{
		System.out.println("In vendor constr");
	}
	

	public Vendor(String name, String email, String password, String role, String city, String phn, double regAmount,
			Date regDate) 
	{
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role = role;
		this.city = city;
		this.phn = phn;
		this.regAmount = regAmount;
		this.regDate = regDate;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=15)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(length=20)
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	@Column(length=20)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name="phone_no",length=10,unique = true)
	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}


	@Column(name = "reg_amnt")
	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	@Column(name="reg_date")
	@Temporal(TemporalType.DATE)
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
				+ role + ", city=" + city + ", phn=" + phn + ", regAmount=" + regAmount + ", regDate=" + regDate + "]";
	}
	
}
