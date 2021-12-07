package com.saugusty.stockmanager.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue
	private Long id;
	private String firstname;
	private String lastname;
	private String adress;
	private String mail;
	private String photo;
	
	@OneToMany(mappedBy = "customer")
	private List<CustomerOrder> customerOders;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Customer(String firstname, String lastname, String adress, String mail, String photo,
			List<CustomerOrder> customerOders) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.mail = mail;
		this.photo = photo;
		this.customerOders = customerOders;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public List<CustomerOrder> getCustomerOders() {
		return customerOders;
	}

	public void setCustomerOders(List<CustomerOrder> customerOders) {
		this.customerOders = customerOders;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", adress=" + adress
				+ ", mail=" + mail + ", photo=" + photo + ", customerOders=" + customerOders + "]";
	}
	
	
}
