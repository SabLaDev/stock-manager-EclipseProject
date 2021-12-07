package com.saugusty.stockmanager.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="customer_orders")
public class CustomerOrder {
	
	@Id
	@GeneratedValue
	private Long id;
    private String code;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @OneToMany(mappedBy = "customerOrder")
    private List<CustomerOrderLine> customerOrderLines;
    
	public CustomerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public CustomerOrder(String code, Customer customer, List<CustomerOrderLine> customerOrderLines) {
		super();
		this.code = code;
		this.customer = customer;
		this.customerOrderLines = customerOrderLines;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<CustomerOrderLine> getCustomerOrderLines() {
		return customerOrderLines;
	}
	public void setCustomerOrderLines(List<CustomerOrderLine> customerOrderLines) {
		this.customerOrderLines = customerOrderLines;
	}
    
	@Override
	public String toString() {
		return "CustomerOrder [id=" + id + ", code=" + code + ", customer=" + customer + ", customerOrderLines="
				+ customerOrderLines + "]";
	}

}
