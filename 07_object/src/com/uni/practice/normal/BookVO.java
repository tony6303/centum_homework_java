package com.uni.practice.normal;

public class BookVO {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public BookVO() {
		super();
	}
	public BookVO(String title, String publisher, String author) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public BookVO(String title, String publisher, String author, int price, double discountRate) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printInformation() {
		System.out.println(this.title +", " + this.publisher +", "  + this.author +", "  + this.price +", "  + this.discountRate);
	}
	
}
