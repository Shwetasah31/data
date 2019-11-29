
package test;

public class Books 
{
   private int id;
   private String name;
   private String author;
   private String subject;
   private float price;
   private String isbn;
   
   
public Books()
{

}
public Books(int id, String name, String author, String subject, float price, String isbn) {
	
	this.id = id;
	this.name = name;
	this.author = author;
	this.subject = subject;
	this.price = price;
	this.isbn = isbn;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}


   
   
}


