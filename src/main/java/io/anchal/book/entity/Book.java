package io.anchal.book.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Book {

	@Id	
	private String serialNo;
	private String isbn;
	private String name;
	private String author;
	private Double price;
	private Date publishedOn;
	
	public Book()
	{
		
	}
	
	
	public Book(String serialNo, String isbn, String name, String author, Double price, Date publishedOn) {
		super();
		this.serialNo = serialNo;
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publishedOn = publishedOn;
	}


	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getPublishedOn() {
		return publishedOn;
	}
	public void setPublishedOn(Date publishedOn) {
		this.publishedOn = publishedOn;
	}
	
	
}
