package edu.emich.cosc211.examples.inheritance.a;

public class Novel extends Book {

	private String genre;

	public Novel(String isbn, String genre) {
		super(isbn);
	}

	public String getGenre() {
		return genre;
	}

}
