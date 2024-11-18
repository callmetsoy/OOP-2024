package Problem1_2;

public class Book extends LibraryItem {
	private int numberOfPages;
	private String genre;
	private float rating;
	
	public Book(String title, String author, int year, int pages, String g) {
		super(title, author, year);
		this.numberOfPages = pages;
		this.genre = g;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public String getGenre() {
		return genre;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(float r) {
		if(r <= 10.0 && r >= 0.0) {
			this.rating = r;
			System.out.println("Rating was changed");
		}
		else {
			System.out.println("Please choose between 0 - 10");
		}
	}
	public boolean complexity() {
		if(numberOfPages > 500) {
			return true;
		}
		else {
			return false;
		}
	}
	public void complexityOfBook() {
		System.out.println("Complexity of the book: " + (complexity()?"Difficult":"Chill"));
	}
	public void annotation() {
		System.out.println("Genre: " + getGenre());
		complexityOfBook();
	}
	@Override
	public void takeItem() {
			if(super.getStatus() == Status.AVAILABLE) {
				System.out.println("Yeah, you can take this book");
				super.setStatus(Status.RESERVED);
				System.out.println("Please no forget to return the book!");
			}
			else{
				System.out.println("Sorry, you can't take this book");
			}
		}
	@Override
	public void returnItem() {
			if(super.getStatus() == Status.RESERVED) {
				System.out.println("Thank you for returning our book");
				super.setStatus(Status.AVAILABLE);
			}
			else {
				System.out.println("You didn't take this book");
			}
		}
	@Override
	public String toString() {
		return super.toString() + "Number of pages: " + numberOfPages + "\n" + "Genre: " + genre;
	}
}