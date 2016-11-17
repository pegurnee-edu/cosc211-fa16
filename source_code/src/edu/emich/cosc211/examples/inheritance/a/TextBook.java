package edu.emich.cosc211.examples.inheritance.a;

public class TextBook extends Book {

	private String subject;

	public TextBook(String isbn, String subject) {
		super(isbn);
	}

	public String getSubject() {
		return this.subject;
	}

}
