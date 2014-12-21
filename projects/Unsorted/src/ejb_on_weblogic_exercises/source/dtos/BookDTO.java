package dtos;

import java.io.Serializable;

public class BookDTO implements Serializable {
	private String title;	// key
	private String author;
	private double price;

	public BookDTO(String ititle, String iauthor, double iprice) {
		title = ititle;
		author = iauthor;
		price = iprice;
	}
	public BookDTO() {
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String string) {
		author = string;
	}

	public void setTitle(String string) {
		title = string;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "BookDTO:" + title + " by:" + author + " price:" + price;
	}
}
