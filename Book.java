public class Book extends Product {
    private String auhtor;

    Book() {
    }

    public Book(String auhtor) {
        this.auhtor = auhtor;
    }

    public Book(String name, double price, String auhtor) {
        super(name, price);
        this.auhtor = auhtor;
    }

    public String getAuhtor() {
        return auhtor;
    }

    public void setAuhtor(String auhtor) {
        this.auhtor = auhtor;
    }

    @Override
    double getDiscount() {
        return price-=price*0.10;
    }

    @Override
    public String toString() {
        return "Book{" +
                "auhtor='" + auhtor + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}'+" after discount: "+getDiscount();
    }
}
