package com.saugusty.stockmanager.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="sales")
public class Sale {
	
	@Id
	@GeneratedValue
	private Long id;
    private String code;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    @OneToMany(mappedBy = "sale")
    private List<SaleLine> saleLines;
    
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sale(String code, Date date, List<SaleLine> saleLines) {
		super();
		this.code = code;
		this.date = date;
		this.saleLines = saleLines;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<SaleLine> getSaleLines() {
		return saleLines;
	}

	public void setSaleLines(List<SaleLine> saleLines) {
		this.saleLines = saleLines;
	}

	@Override
	public String toString() {
		return "Sale [id=" + id + ", code=" + code + ", date=" + date + ", saleLines=" + saleLines + "]";
	}
    
    

}
