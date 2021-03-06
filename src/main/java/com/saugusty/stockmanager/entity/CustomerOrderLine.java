package com.saugusty.stockmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="customer_order_lines")
public class CustomerOrderLine {
	
	@Id
	@GeneratedValue
	 private Long id;
	
	@ManyToOne
	@JoinColumn(name="article_id")
	 private Article article;
	
	@ManyToOne
	@JoinColumn(name="customer_order_id")
	 private CustomerOrder customerOrder;
	 
	public CustomerOrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerOrderLine(Article article, CustomerOrder customerOrder) {
		super();
		this.article = article;
		this.customerOrder = customerOrder;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

	@Override
	public String toString() {
		return "CustomerOrderLine [id=" + id + ", article=" + article + ", customerOrder=" + customerOrder + "]";
	}
	 
	 
}
