package com.saugusty.stockmanager.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "categories")
public class Category {

		@Id
		@GeneratedValue
	 	private Long id;
	    private String code;
	    private String label;
	    
	    @ManyToMany(mappedBy = "category")
	    private List<Article> articles;
	    
		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Category(String code, String label, List<Article> articles) {
			super();
			this.code = code;
			this.label = label;
			this.articles = articles;
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

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public List<Article> getArticles() {
			return articles;
		}

		public void setArticles(List<Article> articles) {
			this.articles = articles;
		}

		@Override
		public String toString() {
			return "Category [id=" + id + ", code=" + code + ", label=" + label + ", articles=" + articles + "]";
		}

}
