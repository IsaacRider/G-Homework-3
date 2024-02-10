package Product;

public class MediaProduct {
	   private String title;
	   private double price;
	   private int year;
	   private String genre;
	   
		public MediaProduct(String title, double price, int year, String genre) {
			
			this.title = title;
			this.price = price;
			this.year = year;
			this.genre = genre;
		}
		
		public String toString() {
			return "title = " + title + ", price = " + price + ", year = " + year + ", genre = " + genre;
		}
}
