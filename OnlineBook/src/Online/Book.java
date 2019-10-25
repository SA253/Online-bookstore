package Online;

import java.util.List;

import org.bson.types.ObjectId;

public class Book {
	private ObjectId id;
	private String bname;
	private String aname;
	private String price;
	 private List<String> review;
	
	public Book() {}
	public Book(String bname, String aname, String price) {
		super();
		
		this.bname = bname;
		this.aname = aname;
		this.price = price;
	}
	public List<String> getReview() {
		return review;
	}
	public void setReview(List<String> review) {
		this.review = review;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
