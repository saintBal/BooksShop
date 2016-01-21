package BooksShop.core.goods;

import BooksShop.core.interfase.GoodsInterfase;

public abstract class BaseGoods implements GoodsInterfase {

    private double price;
    private String name;

    public BaseGoods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int yearBook() {
        return 0;
    }


}
