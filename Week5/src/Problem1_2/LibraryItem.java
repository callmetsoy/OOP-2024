package Problem1_2;

public abstract class LibraryItem {
	
	public enum Status{
		AVAILABLE,
		RESERVED;
	}
	
	private String title, author;
	private int publicationYear;
	private Status status;
	
	// constructor
	public LibraryItem(String t, String a, int p) {
		this.title = t;
		this.author = a;
		this.publicationYear = p;
		this.status = Status.AVAILABLE;
	}
	// getters and setters
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		this.title = t;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		this.author = a;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int p) {
		this.publicationYear = p;
	}

	// Methods: 
	public void takeItem() {
		if(getStatus() == Status.AVAILABLE) {
			System.out.println("Yeah, you can take it");
			setStatus(Status.RESERVED);
			System.out.println("Please no forget to return item !");
		}else {
				System.out.println("Sorry, you can't take it");
		}
	}
	public void returnItem() {
		if(status == Status.RESERVED) {
			System.out.println("Thank you for returning item");
			setStatus(Status.AVAILABLE);
		}
		else {
			System.out.println("You didn't take this item");
		}
	}
	public String toString() {
		return "Title: " + title + "\n" + "Author: " + author + "\n" + "Publication Year: " + publicationYear + "\n";
	}
}
