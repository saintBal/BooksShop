package BooksShop.core.goods;


public class Carrie extends BaseGoods {

    public Carrie(String autorName, double price) {
        super(autorName, price);
    }

    @Override
    public String getName() {
        return "Кэрри";
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
