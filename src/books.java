
public class books {

	
	private String title, author;
	private int copiesAvailable;   

	books(String title, String author, int copiesAvailable) {
		this.title = title;
	    this.author = author;
	    this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	
}
