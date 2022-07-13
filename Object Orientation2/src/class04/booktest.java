package class04;
class Book
{
	private String title;
	private String author;
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	public String toString()
	{
		return title+","+author;
		
	}
}
public class booktest {
	public static void main(String[] args)
	{
		Book book = new Book("demian","herman");
		
		System.out.println(book);
		String str = new String("test");
		System.out.println(str.toString());
	}
}
