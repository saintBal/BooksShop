package BooksShop.core.interfase;


public interface UserInterfase {

    String getName();

    String getLastName();

    int getAge();

    void buy(GoodsInterfase goods);

    void returnGoods(GoodsInterfase goods);

}
