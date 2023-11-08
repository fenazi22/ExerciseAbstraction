public class Movie extends Product {
    private String director;

    Movie() {
    }

    public Movie(String director) {
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    double getDiscount() {
        return price-=price*0.50;

    }

    @Override
    public String toString() {
        return "Movie{" +
                "director='" + director + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}'+" after discount: "+getDiscount();
    }
}
