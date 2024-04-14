public class Movie {

    private String title;
    private MovieGenre genre;
    private int price;
    private String director;
    private long productId;
    private boolean foundId;


    public Movie(String title, MovieGenre genre, int price, long productId) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.productId = productId;
    }

    public Movie(String title, MovieGenre genre, int price, String director, long productId) {
        this(title, genre, price, productId);
        this.director = director;

    }

    public Movie(boolean foundId) {
        this.foundId = foundId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public boolean isFoundId() {
        return foundId;
    }

    public void setFoundId(boolean foundId) {
        this.foundId = foundId;
    }
}
