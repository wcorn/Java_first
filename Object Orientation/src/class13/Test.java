package class13;

public class Test {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copylibrary = new Book[5];
//		for(int i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copylibrary[0] = new Book();
		copylibrary[1] = new Book();
		copylibrary[2] = new Book();
		copylibrary[3] = new Book();
		copylibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copylibrary[i].setAuther(library[i].getAuther());
			copylibrary[i].setTitle(library[i].getTitle());
		}
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		for(Book book : copylibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
