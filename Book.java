public class Book extends TangibleAssett {
    public static void main(String[] args) {
	private String isbn;

	public Book(String name, int price , String color, String isbn){
            super(name, price,color);
	    this.isbn = isbn;
	}

	public String getIsbn() {
            return this.isbn;
	}
