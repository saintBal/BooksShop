package BooksShop.core.goods;


public class Carrie extends BaseGoods {

    public Carrie(String name, double price) {
        super(name, price);
    }

    @Override
    public String getAutorName() {
        return "Стивен Кинг";
    }

    @Override
    public void setPrice(double price) {
        price = 150;
    }

    @Override
    public int yearBook() {
        return 1974;
    }
}
