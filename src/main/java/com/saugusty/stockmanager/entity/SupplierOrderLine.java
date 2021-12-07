package com.saugusty.stockmanager.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="supplier_order_lines")
public class SupplierOrderLine {
	
	@Id
	@GeneratedValue
	 private Long id;
	
	@ManyToOne
	@JoinColumn(name = "article_id")
	 private Article article;
	
	@ManyToOne
	@JoinColumn(name="supplier_order_id")
	 private SupplierOrder supplierOrder;
	 
	public SupplierOrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SupplierOrderLine(Article article, SupplierOrder supplierOrder) {
		super();
		this.article = article;
		this.supplierOrder = supplierOrder;
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

	public SupplierOrder getSupplierOrder() {
		return supplierOrder;
	}

	public void setSupplierOrder(SupplierOrder supplierOrder) {
		this.supplierOrder = supplierOrder;
	}

	@Override
	public String toString() {
		return "SupplierOrderLine [id=" + id + ", article=" + article + ", supplierOrder=" + supplierOrder + "]";
	}
	 
	
	 
}
