package book;

public class Book {
	private String Title;
	private String Author; 
	private int Serial_Num;
	Book(String Title, String Author, int Serial_Num)
	{
		this.Title = Title;
		this.Author = Author;
		this.Serial_Num  = Serial_Num;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getSerial_Num() {
		return Serial_Num;
	}
	public void setSerial_Num(int serial_Num) {
		Serial_Num = serial_Num;
	}
}
